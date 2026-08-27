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

public final class os0 implements org.telegram.ui.Components.j61 {

    public boolean f41161a = true;

    public final PhotoViewer f41162b;

    public os0(PhotoViewer photoViewer) {
        this.f41162b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.m61 m61Var, Exception exc) {
        View viewFindViewWithTag;
        PhotoViewer photoViewer = this.f41162b;
        if (photoViewer.B2 != m61Var) {
            return;
        }
        FileLog.e(exc);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f35675k0.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || viewFindViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f35800y, 0, photoViewer.f35738r2);
        alertDialog$Builder.f22702a.N = LocaleController.getString("AppName", R.string.AppName);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.CantPlayVideo);
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new dl0(this, 3));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.S2(alertDialog$Builder);
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f41162b;
        if (!photoViewer.D3) {
            photoViewer.D3 = true;
            photoViewer.f35583a0.invalidate();
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
            if (m61Var == null || !m61Var.R) {
                AndroidUtilities.runOnUIThread(new ns0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.m61 m61Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.f41162b;
        ArrayList arrayList = photoViewer.f35608c7;
        org.telegram.ui.Components.m61 m61Var2 = photoViewer.B2;
        if (m61Var2 != null) {
            m61Var2.P(d1.f.t() || photoViewer.f35735r);
        }
        if (this.f41161a && (m61Var = photoViewer.B2) != null && m61Var.q() != -9223372036854775807L) {
            this.f41161a = false;
            if (photoViewer.U6.isEmpty() && photoViewer.f35588a7.isEmpty() && photoViewer.W6.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.M4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.M4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.m61 m61Var3 = photoViewer.B2;
                        m61Var3.L((long) (videoEditedInfo.start * m61Var3.q()));
                        wr0 wr0Var = photoViewer.N7;
                        if (wr0Var != null) {
                            wr0Var.setProgress(photoEntry.editedInfo.start);
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
        ye.d dVarP = org.telegram.ui.Components.sf0.p();
        PhotoViewer photoViewer = this.f41162b;
        if (dVarP != null && org.telegram.ui.Components.sf0.p().f49861b.f258a != 0 && (textureView = photoViewer.f35749s3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.f32415l0;
            (sf0Var != null ? sf0Var.f32428h0 : null).setSurfaceTexture(surfaceTexture);
            (sf0Var != null ? sf0Var.f32428h0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.B3) {
            photoViewer.B3 = false;
            if (photoViewer.F3) {
                photoViewer.C3 = 1;
                photoViewer.f35749s3.setSurfaceTexture(surfaceTexture);
                photoViewer.f35749s3.setSurfaceTextureListener(photoViewer.f35634f4);
                photoViewer.f35749s3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.f41162b.x0(false);
        AndroidUtilities.runOnUIThread(new ns0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        PhotoViewer photoViewer = this.f41162b;
        if (photoViewer.f35766u2 != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f10;
            int i13 = (int) f11;
            photoViewer.Q = i13;
            float f12 = i11;
            int i14 = (int) (f10 * f12);
            photoViewer.R = i14;
            ye.d dVar = photoViewer.C2;
            if (dVar != null) {
                dVar.d(i13, i14);
            }
            photoViewer.f35766u2.a(i11 == 0 ? 1.0f : f11 / f12, i12);
            if (photoViewer.f35794x2 instanceof org.telegram.ui.Components.a61) {
                ((org.telegram.ui.Components.a61) photoViewer.f35794x2).setHDRInfo(photoViewer.B2.r(null));
                org.telegram.ui.Components.a61 a61Var = (org.telegram.ui.Components.a61) photoViewer.f35794x2;
                a61Var.d = i13;
                a61Var.f26646e = i11;
                org.telegram.ui.Components.jz jzVar = a61Var.f26644b;
                if (jzVar != null) {
                    jzVar.postRunnable(new org.telegram.ui.Components.fz(jzVar, i13, i11, 0));
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
        PhotoViewer photoViewer = this.f41162b;
        bf.e eVar = photoViewer.L8;
        if (eVar != null) {
            eVar.run();
            photoViewer.L8 = null;
        }
        long j10 = aVar.f10519e;
        if (j10 == photoViewer.S7) {
            photoViewer.R7 = j10;
            photoViewer.S7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
            if (m61Var == null || !m61Var.R) {
                AndroidUtilities.runOnUIThread(new ns0(this, 2), 64L);
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
