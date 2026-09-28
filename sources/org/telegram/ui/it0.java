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
public final class it0 implements org.telegram.ui.Components.r71 {
    public boolean f34576a = true;
    public final PhotoViewer f34577b;

    public it0(PhotoViewer photoViewer) {
        this.f34577b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.u71 u71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f34577b;
        if (photoViewer.F2 == u71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f31310o0.f19789b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f31402y, 0, photoViewer.f31375v2);
                alertDialog$Builder.f18662a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new ml0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.R2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f34577b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f31224e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
            if (u71Var == null || !u71Var.V) {
                AndroidUtilities.runOnUIThread(new ht0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.u71 u71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f34577b;
        ArrayList arrayList = photoViewer.f31248g7;
        org.telegram.ui.Components.u71 u71Var2 = photoViewer.F2;
        if (u71Var2 != null) {
            if (!b5.d.u() && !photoViewer.f31335r) {
                z11 = false;
            } else {
                z11 = true;
            }
            u71Var2.O(z11);
        }
        if (this.f34576a && (u71Var = photoViewer.F2) != null && u71Var.p() != -9223372036854775807L) {
            this.f34576a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f31193a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.u71 u71Var3 = photoViewer.F2;
                        u71Var3.K(videoEditedInfo.start * ((float) u71Var3.p()));
                        qs0 qs0Var = photoViewer.S7;
                        if (qs0Var != null) {
                            qs0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.x3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        pf.e p5 = org.telegram.ui.Components.qg0.p();
        PhotoViewer photoViewer = this.f34577b;
        if (p5 != null && org.telegram.ui.Components.qg0.p().f41062b.f42514a != 0 && (textureView = photoViewer.f31386w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.qg0 qg0Var = org.telegram.ui.Components.qg0.f27691p0;
            TextureView textureView3 = null;
            if (qg0Var != null) {
                textureView2 = qg0Var.f27707l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (qg0Var != null) {
                textureView3 = qg0Var.f27707l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f31386w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f31386w3.setSurfaceTextureListener(photoViewer.f31271j4);
                photoViewer.f31386w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f34577b.x0(false);
        AndroidUtilities.runOnUIThread(new ht0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f34577b;
        if (photoViewer.f31405y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            pf.e eVar = photoViewer.G2;
            if (eVar != null) {
                eVar.d(i13, i14);
            }
            kt0 kt0Var = photoViewer.f31405y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            kt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.k71) {
                ((org.telegram.ui.Components.k71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) photoViewer.B2;
                k71Var.d = i13;
                k71Var.e = i11;
                org.telegram.ui.Components.xz xzVar = k71Var.f25619b;
                if (xzVar != null) {
                    xzVar.postRunnable(new org.telegram.ui.Components.tz(xzVar, i13, i11, 0));
                }
                if (photoViewer.f31208c2 == 1) {
                    photoViewer.y2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f34577b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j3 = aVar.e;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
            if (u71Var == null || !u71Var.V) {
                AndroidUtilities.runOnUIThread(new ht0(this, 2), 64L);
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
