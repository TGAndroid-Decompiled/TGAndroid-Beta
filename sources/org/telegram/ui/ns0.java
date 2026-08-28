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
public final class ns0 implements org.telegram.ui.Components.h61 {
    public boolean f40804a = true;
    public final PhotoViewer f40805b;

    public ns0(PhotoViewer photoViewer) {
        this.f40805b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.k61 k61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f40805b;
        if (photoViewer.B2 == k61Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f35672k0.f23901b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f35797y, 0, photoViewer.f35735r2);
                alertDialog$Builder.f22702a.N = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new dl0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f40805b;
        if (!photoViewer.D3) {
            photoViewer.D3 = true;
            photoViewer.f35580a0.invalidate();
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
            if (k61Var == null || !k61Var.R) {
                AndroidUtilities.runOnUIThread(new ms0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i9) {
        org.telegram.ui.Components.k61 k61Var;
        int i10;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f40805b;
        ArrayList arrayList = photoViewer.f35605c7;
        org.telegram.ui.Components.k61 k61Var2 = photoViewer.B2;
        if (k61Var2 != null) {
            if (!d1.f.t() && !photoViewer.f35732r) {
                z11 = false;
            } else {
                z11 = true;
            }
            k61Var2.P(z11);
        }
        if (this.f40804a && (k61Var = photoViewer.B2) != null && k61Var.q() != -9223372036854775807L) {
            this.f40804a = false;
            if (photoViewer.U6.isEmpty() && photoViewer.f35585a7.isEmpty() && photoViewer.W6.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.M4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.M4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.k61 k61Var3 = photoViewer.B2;
                        k61Var3.L(videoEditedInfo.start * ((float) k61Var3.q()));
                        vr0 vr0Var = photoViewer.N7;
                        if (vr0Var != null) {
                            vr0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i9, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        xe.d p6 = org.telegram.ui.Components.pf0.p();
        PhotoViewer photoViewer = this.f40805b;
        if (p6 != null && org.telegram.ui.Components.pf0.p().f49145b.f50439a != 0 && (textureView = photoViewer.f35746s3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.f31622l0;
            TextureView textureView3 = null;
            if (pf0Var != null) {
                textureView2 = pf0Var.f31635h0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (pf0Var != null) {
                textureView3 = pf0Var.f31635h0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.B3) {
            photoViewer.B3 = false;
            if (photoViewer.F3) {
                photoViewer.C3 = 1;
                photoViewer.f35746s3.setSurfaceTexture(surfaceTexture);
                photoViewer.f35746s3.setSurfaceTextureListener(photoViewer.f35631f4);
                photoViewer.f35746s3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f40805b.w0(false);
        AndroidUtilities.runOnUIThread(new ms0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        float f11;
        PhotoViewer photoViewer = this.f40805b;
        if (photoViewer.f35763u2 != null) {
            if (i11 == 90 || i11 == 270) {
                i10 = i9;
                i9 = i10;
            }
            float f12 = i9 * f10;
            int i12 = (int) f12;
            photoViewer.Q = i12;
            float f13 = i10;
            int i13 = (int) (f10 * f13);
            photoViewer.R = i13;
            xe.d dVar = photoViewer.C2;
            if (dVar != null) {
                dVar.d(i12, i13);
            }
            ps0 ps0Var = photoViewer.f35763u2;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            ps0Var.a(f11, i11);
            if (photoViewer.f35790x2 instanceof org.telegram.ui.Components.y51) {
                ((org.telegram.ui.Components.y51) photoViewer.f35790x2).setHDRInfo(photoViewer.B2.r(null));
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) photoViewer.f35790x2;
                y51Var.d = i12;
                y51Var.f34864e = i10;
                org.telegram.ui.Components.hz hzVar = y51Var.f34862b;
                if (hzVar != null) {
                    hzVar.postRunnable(new org.telegram.ui.Components.dz(hzVar, i12, i10, 0));
                }
                if (photoViewer.Y1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.E3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(i3.a aVar) {
        PhotoViewer photoViewer = this.f40805b;
        af.f fVar = photoViewer.L8;
        if (fVar != null) {
            fVar.run();
            photoViewer.L8 = null;
        }
        long j10 = aVar.f10878e;
        if (j10 == photoViewer.S7) {
            photoViewer.R7 = j10;
            photoViewer.S7 = -1L;
            PhotoViewer.U(photoViewer);
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
            if (k61Var == null || !k61Var.R) {
                AndroidUtilities.runOnUIThread(new ms0(this, 2), 64L);
            }
        }
    }

    @Override
    public final void onSeekFinished(i3.a aVar) {
    }

    @Override
    public final void onSeekStarted(i3.a aVar) {
    }
}
