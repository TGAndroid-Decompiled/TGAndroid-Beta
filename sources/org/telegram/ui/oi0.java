package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class oi0 extends FrameLayout {
    public final int f36337a;
    public final dj0 f36338b;

    public oi0(dj0 dj0Var, Context context, int i10) {
        super(context);
        this.f36337a = i10;
        this.f36338b = dj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f36337a) {
            case 0:
                super.dispatchDraw(canvas);
                dj0 dj0Var = this.f36338b;
                pi0 pi0Var = dj0Var.f33079a0;
                pi0Var.e(canvas);
                ArrayList arrayList = pi0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) hg.k0.g(1, arrayList);
                    ImageReceiver imageReceiver = fzVar.f33796r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (fzVar.f33797s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                fzVar.f33797s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                fzVar.f33797s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (fzVar.f33797s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(fzVar.f33797s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    dj0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!pi0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                dj0 dj0Var2 = this.f36338b;
                mb0 mb0Var = dj0Var2.d;
                if (mb0Var != null) {
                    if (dj0Var2.E == 1.0f && dj0Var2.f33094n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mb0Var.a(z10);
                }
                if (dj0Var2.E > 0.0f && dj0Var2.f33094n != null) {
                    dj0Var2.f33099r.reset();
                    float width = getWidth() / dj0Var2.f33086f.getWidth();
                    dj0Var2.f33099r.postScale(width, width);
                    dj0Var2.h.setLocalMatrix(dj0Var2.f33099r);
                    dj0Var2.f33094n.setAlpha((int) (dj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dj0Var2.f33094n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f36337a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36338b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int measuredHeight;
        qi0 qi0Var;
        int height;
        switch (this.f36337a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                dj0 dj0Var = this.f36338b;
                if (!dj0Var.f33088g0 || dj0Var.f33089h0) {
                    ArrayList arrayList = dj0Var.N;
                    wi0 wi0Var = dj0Var.K;
                    if (dj0Var.F.getWidth() > 0) {
                        dj0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.rk.D(6.0f, dj0Var.W.getWidth() - dj0Var.W.l(), iArr[0])};
                        dj0Var.X.setScaleX(dj0Var.W.getScaleX());
                        dj0Var.X.setScaleY(dj0Var.W.getScaleY());
                        int[] iArr2 = dj0Var.f33096o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = wi0Var.getMeasuredHeight() - dj0Var.X.getHeight();
                        if (dj0Var.f33085e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + dj0Var.e.f10593b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = dj0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (dj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - dj0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (dj0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - dj0Var.W.getHeight();
                        }
                        dj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (qi0Var.getWidth() - dj0Var.X.l())));
                        dj0Var.X.setY(iArr[1]);
                        if (dj0Var.m0) {
                            iArr[0] = iArr[0] - (dj0Var.Y - dj0Var.W.l());
                        }
                        wi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - wi0Var.getMeasuredWidth());
                        if (dj0Var.f33088g0) {
                            org.telegram.messenger.rk.s(wi0Var.animate().translationY(((dj0Var.X.getHeight() + iArr[1]) - wi0Var.getMeasuredHeight()) - wi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            wi0Var.setY((dj0Var.X.getHeight() + iArr[1]) - wi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = dj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - dj0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = dj0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = dj0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = dj0Var.f33084d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.l0.b(6.0f, (dj0Var.X.l() + iArr[0]) - dj0Var.f33084d0.getMeasuredWidth(), 0));
                            RectF rectF = dj0Var.f33093l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = dj0Var.f33084d0;
                                float max = Math.max(dj0Var.e.f10593b, rectF.top - frameLayout2.getMeasuredWidth());
                                dj0Var.f33083c0 = max;
                                frameLayout2.setY(max);
                                ri0 ri0Var = dj0Var.f33085e0;
                                if (ri0Var != null) {
                                    ri0Var.setY(Math.max(dj0Var.e.f10593b, (dj0Var.f33093l0.top - AndroidUtilities.dp(24.0f)) - dj0Var.f33085e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (dj0Var.X.getHeight() + iArr[1]) - wi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = dj0Var.f33084d0;
                                float max2 = Math.max(dj0Var.e.f10593b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                dj0Var.f33083c0 = max2;
                                frameLayout3.setY(max2);
                                ri0 ri0Var2 = dj0Var.f33085e0;
                                if (ri0Var2 != null) {
                                    ri0Var2.setY(Math.max(0.0f, (height2 - ri0Var2.getMeasuredHeight()) - dj0Var.f33083c0));
                                }
                            }
                        }
                    }
                    dj0Var.f33088g0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f36337a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                dj0 dj0Var = this.f36338b;
                gh.d.c(dj0Var.f33091j0, dj0Var.F);
                ViewGroup viewGroup = dj0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
