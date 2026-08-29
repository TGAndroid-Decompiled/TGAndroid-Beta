package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ms0 implements org.telegram.ui.Components.u61 {
    public boolean f40631a = true;
    public final PhotoViewer f40632b;

    public ms0(PhotoViewer photoViewer) {
        this.f40632b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.x61 x61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f40632b;
        if (photoViewer.B2 == x61Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f35738k0.f23915b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f35864y, 0, photoViewer.f35802r2);
                alertDialog$Builder.f22714a.N = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new zk0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f40632b;
        if (!photoViewer.D3) {
            photoViewer.D3 = true;
            photoViewer.f35647a0.invalidate();
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
            if (x61Var == null || !x61Var.R) {
                AndroidUtilities.runOnUIThread(new ls0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.x61 x61Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f40632b;
        ArrayList arrayList = photoViewer.f35671c7;
        org.telegram.ui.Components.x61 x61Var2 = photoViewer.B2;
        if (x61Var2 != null) {
            if (!d1.f.u() && !photoViewer.f35799r) {
                z11 = false;
            } else {
                z11 = true;
            }
            x61Var2.P(z11);
        }
        if (this.f40631a && (x61Var = photoViewer.B2) != null && x61Var.q() != -9223372036854775807L) {
            this.f40631a = false;
            if (photoViewer.U6.isEmpty() && photoViewer.f35653a7.isEmpty() && photoViewer.W6.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.M4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.M4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.x61 x61Var3 = photoViewer.B2;
                        x61Var3.L(videoEditedInfo.start * ((float) x61Var3.q()));
                        ur0 ur0Var = photoViewer.N7;
                        if (ur0Var != null) {
                            ur0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        af.g p10 = org.telegram.ui.Components.bg0.p();
        PhotoViewer photoViewer = this.f40632b;
        if (p10 != null && org.telegram.ui.Components.bg0.p().f398b.f3044a != 0 && (textureView = photoViewer.f35812s3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.bg0 bg0Var = org.telegram.ui.Components.bg0.f27076l0;
            TextureView textureView3 = null;
            if (bg0Var != null) {
                textureView2 = bg0Var.f27089h0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (bg0Var != null) {
                textureView3 = bg0Var.f27089h0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.B3) {
            photoViewer.B3 = false;
            if (photoViewer.F3) {
                photoViewer.C3 = 1;
                photoViewer.f35812s3.setSurfaceTexture(surfaceTexture);
                photoViewer.f35812s3.setSurfaceTextureListener(photoViewer.f35697f4);
                photoViewer.f35812s3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f40632b.x0(false);
        AndroidUtilities.runOnUIThread(new ls0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        float f10;
        PhotoViewer photoViewer = this.f40632b;
        if (photoViewer.f35829u2 != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f9;
            int i13 = (int) f11;
            photoViewer.Q = i13;
            float f12 = i11;
            int i14 = (int) (f9 * f12);
            photoViewer.R = i14;
            af.g gVar = photoViewer.C2;
            if (gVar != null) {
                gVar.d(i13, i14);
            }
            os0 os0Var = photoViewer.f35829u2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            os0Var.a(f10, i12);
            if (photoViewer.f35858x2 instanceof org.telegram.ui.Components.l61) {
                ((org.telegram.ui.Components.l61) photoViewer.f35858x2).setHDRInfo(photoViewer.B2.r(null));
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) photoViewer.f35858x2;
                l61Var.d = i13;
                l61Var.f30237e = i11;
                org.telegram.ui.Components.qz qzVar = l61Var.f30235b;
                if (qzVar != null) {
                    qzVar.postRunnable(new org.telegram.ui.Components.mz(qzVar, i13, i11, 0));
                }
                if (photoViewer.Y1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.E3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
        PhotoViewer photoViewer = this.f40632b;
        c2.p pVar = photoViewer.L8;
        if (pVar != null) {
            pVar.run();
            photoViewer.L8 = null;
        }
        long j10 = aVar.f13402e;
        if (j10 == photoViewer.S7) {
            photoViewer.R7 = j10;
            photoViewer.S7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
            if (x61Var == null || !x61Var.R) {
                AndroidUtilities.runOnUIThread(new ls0(this, 2), 64L);
            }
        }
    }

    @Override
    public final void onSeekFinished(k3.a aVar) {
    }

    @Override
    public final void onSeekStarted(k3.a aVar) {
    }
}
