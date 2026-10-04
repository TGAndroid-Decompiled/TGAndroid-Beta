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
public final class lt0 implements org.telegram.ui.Components.a81 {
    public boolean f38333a = true;
    public final PhotoViewer f38334b;

    public lt0(PhotoViewer photoViewer) {
        this.f38334b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.d81 d81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f38334b;
        if (photoViewer.F2 == d81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f33980o0.f21570b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f34072y, 0, photoViewer.f34045v2);
                alertDialog$Builder.f20367a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new jl0(this, 4));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f38334b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33894e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.d81 d81Var = photoViewer.F2;
            if (d81Var == null || !d81Var.V) {
                AndroidUtilities.runOnUIThread(new kt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.d81 d81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f38334b;
        ArrayList arrayList = photoViewer.f33918g7;
        org.telegram.ui.Components.d81 d81Var2 = photoViewer.F2;
        if (d81Var2 != null) {
            if (!b5.d.u() && !photoViewer.f34005r) {
                z11 = false;
            } else {
                z11 = true;
            }
            d81Var2.O(z11);
        }
        if (this.f38333a && (d81Var = photoViewer.F2) != null && d81Var.p() != -9223372036854775807L) {
            this.f38333a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33862a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.d81 d81Var3 = photoViewer.F2;
                        d81Var3.K(videoEditedInfo.start * ((float) d81Var3.p()));
                        ts0 ts0Var = photoViewer.S7;
                        if (ts0Var != null) {
                            ts0Var.setProgress(photoEntry.editedInfo.start);
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
        pf.e p5 = org.telegram.ui.Components.rg0.p();
        PhotoViewer photoViewer = this.f38334b;
        if (p5 != null && org.telegram.ui.Components.rg0.p().f44410b.f46018a != 0 && (textureView = photoViewer.f34056w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f30377p0;
            TextureView textureView3 = null;
            if (rg0Var != null) {
                textureView2 = rg0Var.f30394l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (rg0Var != null) {
                textureView3 = rg0Var.f30394l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f34056w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f34056w3.setSurfaceTextureListener(photoViewer.f33941j4);
                photoViewer.f34056w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f38334b.x0(false);
        AndroidUtilities.runOnUIThread(new kt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f38334b;
        if (photoViewer.f34075y2 != null) {
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
            nt0 nt0Var = photoViewer.f34075y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            nt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.t71) {
                ((org.telegram.ui.Components.t71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.t71 t71Var = (org.telegram.ui.Components.t71) photoViewer.B2;
                t71Var.d = i13;
                t71Var.f30985e = i11;
                org.telegram.ui.Components.yz yzVar = t71Var.f30983b;
                if (yzVar != null) {
                    yzVar.postRunnable(new org.telegram.ui.Components.uz(yzVar, i13, i11, 0));
                }
                if (photoViewer.f33877c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f38334b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j3 = aVar.f13642e;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.T(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.d81 d81Var = photoViewer.F2;
            if (d81Var == null || !d81Var.V) {
                AndroidUtilities.runOnUIThread(new kt0(this, 2), 64L);
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
