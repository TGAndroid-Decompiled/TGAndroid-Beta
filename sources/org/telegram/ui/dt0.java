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
public final class dt0 implements org.telegram.ui.Components.p81 {
    public boolean f38926a = true;
    public final PhotoViewer f38927b;

    public dt0(PhotoViewer photoViewer) {
        this.f38927b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.s81 s81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f38927b;
        if (photoViewer.F2 == s81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f35730o0.f23174b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f35822y, 0, photoViewer.f35795v2);
                alertDialog$Builder.f22366a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new hl0(this, 4));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.U2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f38927b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f35643e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
            if (s81Var == null || !s81Var.V) {
                AndroidUtilities.runOnUIThread(new ct0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.s81 s81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.s81 s81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f38927b;
        ArrayList arrayList = photoViewer.g7;
        org.telegram.ui.Components.s81 s81Var3 = photoViewer.F2;
        if (s81Var3 != null) {
            if (!c5.d.u() && !photoViewer.f35756r) {
                z11 = false;
            } else {
                z11 = true;
            }
            s81Var3.O(z11);
        }
        if (this.f38926a && (s81Var = photoViewer.F2) != null && s81Var.p() != -9223372036854775807L) {
            this.f38926a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.f35650e7.isEmpty() && photoViewer.f35612a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) s81Var2.p()));
                        ls0 ls0Var = photoViewer.S7;
                        if (ls0Var != null) {
                            ls0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.A3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        sf.d p10 = org.telegram.ui.Components.ch0.p();
        PhotoViewer photoViewer = this.f38927b;
        if (p10 != null && org.telegram.ui.Components.ch0.p().f48126b.f49719a != 0 && (textureView = photoViewer.f35806w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f27157p0;
            TextureView textureView3 = null;
            if (ch0Var != null) {
                textureView2 = ch0Var.f27173l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (ch0Var != null) {
                textureView3 = ch0Var.f27173l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f35806w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f35806w3.setSurfaceTextureListener(photoViewer.f35691j4);
                photoViewer.f35806w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f38927b.y0(false);
        AndroidUtilities.runOnUIThread(new ct0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f38927b;
        if (photoViewer.f35825y2 != null) {
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
            ft0 ft0Var = photoViewer.f35825y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            ft0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.h81) {
                ((org.telegram.ui.Components.h81) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.h81 h81Var = (org.telegram.ui.Components.h81) photoViewer.B2;
                h81Var.d = i13;
                h81Var.e = i11;
                org.telegram.ui.Components.e00 e00Var = h81Var.f28860b;
                if (e00Var != null) {
                    e00Var.postRunnable(new org.telegram.ui.Components.a00(e00Var, i13, i11, 0));
                }
                if (photoViewer.f35627c2 == 1) {
                    photoViewer.B2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f38927b;
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
            org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
            if (s81Var == null || !s81Var.V) {
                AndroidUtilities.runOnUIThread(new ct0(this, 2), 64L);
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
