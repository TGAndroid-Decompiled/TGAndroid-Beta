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
public final class pt0 implements org.telegram.ui.Components.q71 {
    public boolean f35900a = true;
    public final PhotoViewer f35901b;

    public pt0(PhotoViewer photoViewer) {
        this.f35901b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.t71 t71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f35901b;
        if (photoViewer.F2 == t71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f30135o0.f18686b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f30227y, 0, photoViewer.f30200v2);
                alertDialog$Builder.f17528a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new ul0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f35901b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f30049e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
            if (t71Var == null || !t71Var.V) {
                AndroidUtilities.runOnUIThread(new ot0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.t71 t71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f35901b;
        ArrayList arrayList = photoViewer.f30073g7;
        org.telegram.ui.Components.t71 t71Var2 = photoViewer.F2;
        if (t71Var2 != null) {
            if (!b5.d.u() && !photoViewer.f30160r) {
                z11 = false;
            } else {
                z11 = true;
            }
            t71Var2.O(z11);
        }
        if (this.f35900a && (t71Var = photoViewer.F2) != null && t71Var.p() != -9223372036854775807L) {
            this.f35900a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f30018a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.t71 t71Var3 = photoViewer.F2;
                        t71Var3.K(videoEditedInfo.start * ((float) t71Var3.p()));
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
        pf.e p5 = org.telegram.ui.Components.og0.p();
        PhotoViewer photoViewer = this.f35901b;
        if (p5 != null && org.telegram.ui.Components.og0.p().f39920b.f41439a != 0 && (textureView = photoViewer.f30211w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f25781p0;
            TextureView textureView3 = null;
            if (og0Var != null) {
                textureView2 = og0Var.f25797l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (og0Var != null) {
                textureView3 = og0Var.f25797l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f30211w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f30211w3.setSurfaceTextureListener(photoViewer.f30096j4);
                photoViewer.f30211w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f35901b.x0(false);
        AndroidUtilities.runOnUIThread(new ot0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f35901b;
        if (photoViewer.f30230y2 != null) {
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
            rt0 rt0Var = photoViewer.f30230y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            rt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.h71) {
                ((org.telegram.ui.Components.h71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) photoViewer.B2;
                h71Var.d = i13;
                h71Var.e = i11;
                org.telegram.ui.Components.c00 c00Var = h71Var.f23538b;
                if (c00Var != null) {
                    c00Var.postRunnable(new org.telegram.ui.Components.yz(c00Var, i13, i11, 0));
                }
                if (photoViewer.f30033c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f35901b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.P8;
        if (pVar != null) {
            pVar.run();
            photoViewer.P8 = null;
        }
        long j3 = aVar.e;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
            if (t71Var == null || !t71Var.V) {
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
