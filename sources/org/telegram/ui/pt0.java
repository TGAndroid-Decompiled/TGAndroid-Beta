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
public final class pt0 implements org.telegram.ui.Components.d71 {
    public boolean f39659a = true;
    public final PhotoViewer f39660b;

    public pt0(PhotoViewer photoViewer) {
        this.f39660b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.g71 g71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f39660b;
        if (photoViewer.F2 == g71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f33662o0.f21405b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f33754y, 0, photoViewer.f33727v2);
                alertDialog$Builder.f20225a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new vl0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f39660b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33576e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
            if (g71Var == null || !g71Var.V) {
                AndroidUtilities.runOnUIThread(new ot0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.g71 g71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f39660b;
        ArrayList arrayList = photoViewer.f33600g7;
        org.telegram.ui.Components.g71 g71Var2 = photoViewer.F2;
        if (g71Var2 != null) {
            if (!b5.d.u() && !photoViewer.f33687r) {
                z11 = false;
            } else {
                z11 = true;
            }
            g71Var2.O(z11);
        }
        if (this.f39659a && (g71Var = photoViewer.F2) != null && g71Var.p() != -9223372036854775807L) {
            this.f39659a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33544a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.g71 g71Var3 = photoViewer.F2;
                        g71Var3.K(videoEditedInfo.start * ((float) g71Var3.p()));
                        xs0 xs0Var = photoViewer.R7;
                        if (xs0Var != null) {
                            xs0Var.setProgress(photoEntry.editedInfo.start);
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
        qf.e p5 = org.telegram.ui.Components.eg0.p();
        PhotoViewer photoViewer = this.f39660b;
        if (p5 != null && org.telegram.ui.Components.eg0.p().f44382b.f46024a != 0 && (textureView = photoViewer.f33738w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f25702p0;
            TextureView textureView3 = null;
            if (eg0Var != null) {
                textureView2 = eg0Var.f25719l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (eg0Var != null) {
                textureView3 = eg0Var.f25719l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f33738w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f33738w3.setSurfaceTextureListener(photoViewer.f33623j4);
                photoViewer.f33738w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f39660b.x0(false);
        AndroidUtilities.runOnUIThread(new ot0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f39660b;
        if (photoViewer.f33757y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            qf.e eVar = photoViewer.G2;
            if (eVar != null) {
                eVar.d(i13, i14);
            }
            rt0 rt0Var = photoViewer.f33757y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            rt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.u61) {
                ((org.telegram.ui.Components.u61) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) photoViewer.B2;
                u61Var.d = i13;
                u61Var.f30850e = i11;
                org.telegram.ui.Components.vz vzVar = u61Var.f30848b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.rz(vzVar, i13, i11, 0));
                }
                if (photoViewer.f33559c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f39660b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.P8;
        if (pVar != null) {
            pVar.run();
            photoViewer.P8 = null;
        }
        long j3 = aVar.f13192e;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
            if (g71Var == null || !g71Var.V) {
                AndroidUtilities.runOnUIThread(new ot0(this, 2), 64L);
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
