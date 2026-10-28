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
public final class ft0 implements org.telegram.ui.Components.q81 {
    public boolean f39422a = true;
    public final PhotoViewer f39423b;

    public ft0(PhotoViewer photoViewer) {
        this.f39423b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.t81 t81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f39423b;
        if (photoViewer.F2 == t81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f35757o0.f23177b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f35849y, 0, photoViewer.f35822v2);
                alertDialog$Builder.f22369a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new jl0(this, 4));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.V2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f39423b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f35670e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
            if (t81Var == null || !t81Var.V) {
                AndroidUtilities.runOnUIThread(new et0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.t81 t81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.t81 t81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f39423b;
        ArrayList arrayList = photoViewer.g7;
        org.telegram.ui.Components.t81 t81Var3 = photoViewer.F2;
        if (t81Var3 != null) {
            if (!c5.d.u() && !photoViewer.f35783r) {
                z11 = false;
            } else {
                z11 = true;
            }
            t81Var3.O(z11);
        }
        if (this.f39422a && (t81Var = photoViewer.F2) != null && t81Var.p() != -9223372036854775807L) {
            this.f39422a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.f35677e7.isEmpty() && photoViewer.f35639a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) t81Var2.p()));
                        ns0 ns0Var = photoViewer.S7;
                        if (ns0Var != null) {
                            ns0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.B3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        sf.d p10 = org.telegram.ui.Components.dh0.p();
        PhotoViewer photoViewer = this.f39423b;
        if (p10 != null && org.telegram.ui.Components.dh0.p().f48167b.f49757a != 0 && (textureView = photoViewer.f35833w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.f27444p0;
            TextureView textureView3 = null;
            if (dh0Var != null) {
                textureView2 = dh0Var.f27460l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (dh0Var != null) {
                textureView3 = dh0Var.f27460l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f35833w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f35833w3.setSurfaceTextureListener(photoViewer.f35718j4);
                photoViewer.f35833w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f39423b.y0(false);
        AndroidUtilities.runOnUIThread(new et0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f39423b;
        if (photoViewer.f35852y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            sf.d dVar = photoViewer.G2;
            if (dVar != null) {
                dVar.d(i13, i14);
            }
            ht0 ht0Var = photoViewer.f35852y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            ht0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.i81) {
                ((org.telegram.ui.Components.i81) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) photoViewer.B2;
                i81Var.d = i13;
                i81Var.e = i11;
                org.telegram.ui.Components.e00 e00Var = i81Var.f29238b;
                if (e00Var != null) {
                    e00Var.postRunnable(new org.telegram.ui.Components.a00(e00Var, i13, i11, 0));
                }
                if (photoViewer.f35654c2 == 1) {
                    photoViewer.C2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f39423b;
        a8.fg fgVar = photoViewer.Q8;
        if (fgVar != null) {
            fgVar.run();
            photoViewer.Q8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.X7) {
            photoViewer.W7 = j10;
            photoViewer.X7 = -1L;
            PhotoViewer.W(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.t81 t81Var = photoViewer.F2;
            if (t81Var == null || !t81Var.V) {
                AndroidUtilities.runOnUIThread(new et0(this, 2), 64L);
            }
        }
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
    }
}
