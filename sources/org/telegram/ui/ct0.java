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
public final class ct0 implements org.telegram.ui.Components.g71 {
    public boolean f35858a = true;
    public final PhotoViewer f35859b;

    public ct0(PhotoViewer photoViewer) {
        this.f35859b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.j71 j71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f35859b;
        if (photoViewer.C2 == j71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f34321l0.f22346b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f34439y, 0, photoViewer.f34387s2);
                alertDialog$Builder.f21168a.O = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new kl0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f35859b;
        if (!photoViewer.E3) {
            photoViewer.E3 = true;
            photoViewer.f34230b0.invalidate();
        }
        if (photoViewer.B2 != null) {
            org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
            if (j71Var == null || !j71Var.S) {
                AndroidUtilities.runOnUIThread(new bt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z4, int i10) {
        org.telegram.ui.Components.j71 j71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z10;
        PhotoViewer photoViewer = this.f35859b;
        ArrayList arrayList = photoViewer.f34255d7;
        org.telegram.ui.Components.j71 j71Var2 = photoViewer.C2;
        if (j71Var2 != null) {
            if (!d1.f.u() && !photoViewer.f34374r) {
                z10 = false;
            } else {
                z10 = true;
            }
            j71Var2.O(z10);
        }
        if (this.f35858a && (j71Var = photoViewer.C2) != null && j71Var.p() != -9223372036854775807L) {
            this.f35858a = false;
            if (photoViewer.V6.isEmpty() && photoViewer.f34237b7.isEmpty() && photoViewer.X6.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.N4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.N4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.j71 j71Var3 = photoViewer.C2;
                        j71Var3.K(videoEditedInfo.start * ((float) j71Var3.p()));
                        js0 js0Var = photoViewer.O7;
                        if (js0Var != null) {
                            js0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z4);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        cf.f p10 = org.telegram.ui.Components.ng0.p();
        PhotoViewer photoViewer = this.f35859b;
        if (p10 != null && org.telegram.ui.Components.ng0.p().f2492b.f5036a != 0 && (textureView = photoViewer.f34396t3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.ng0 ng0Var = org.telegram.ui.Components.ng0.m0;
            TextureView textureView3 = null;
            if (ng0Var != null) {
                textureView2 = ng0Var.f29476i0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (ng0Var != null) {
                textureView3 = ng0Var.f29476i0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.C3) {
            photoViewer.C3 = false;
            if (photoViewer.G3) {
                photoViewer.D3 = 1;
                photoViewer.f34396t3.setSurfaceTexture(surfaceTexture);
                photoViewer.f34396t3.setSurfaceTextureListener(photoViewer.f34280g4);
                photoViewer.f34396t3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f35859b.x0(false);
        AndroidUtilities.runOnUIThread(new bt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        float f11;
        PhotoViewer photoViewer = this.f35859b;
        if (photoViewer.f34412v2 != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f12 = i10 * f10;
            int i13 = (int) f12;
            photoViewer.R = i13;
            float f13 = i11;
            int i14 = (int) (f10 * f13);
            photoViewer.S = i14;
            cf.f fVar = photoViewer.D2;
            if (fVar != null) {
                fVar.d(i13, i14);
            }
            et0 et0Var = photoViewer.f34412v2;
            if (i11 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / f13;
            }
            et0Var.a(f11, i12);
            if (photoViewer.f34442y2 instanceof org.telegram.ui.Components.x61) {
                ((org.telegram.ui.Components.x61) photoViewer.f34442y2).setHDRInfo(photoViewer.C2.q(null));
                org.telegram.ui.Components.x61 x61Var = (org.telegram.ui.Components.x61) photoViewer.f34442y2;
                x61Var.d = i13;
                x61Var.f32960e = i11;
                org.telegram.ui.Components.xz xzVar = x61Var.f32958b;
                if (xzVar != null) {
                    xzVar.postRunnable(new org.telegram.ui.Components.tz(xzVar, i13, i11, 0));
                }
                if (photoViewer.Z1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.F3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
        PhotoViewer photoViewer = this.f35859b;
        c2.p pVar = photoViewer.M8;
        if (pVar != null) {
            pVar.run();
            photoViewer.M8 = null;
        }
        long j10 = aVar.f10412e;
        if (j10 == photoViewer.T7) {
            photoViewer.S7 = j10;
            photoViewer.T7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.B2 != null) {
            org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
            if (j71Var == null || !j71Var.S) {
                AndroidUtilities.runOnUIThread(new bt0(this, 2), 64L);
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
