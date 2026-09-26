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
public final class gi0 extends FrameLayout {
    public final int f33949a;
    public final vi0 f33950b;

    public gi0(vi0 vi0Var, Context context, int i10) {
        super(context);
        this.f33949a = i10;
        this.f33950b = vi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f33949a) {
            case 0:
                super.dispatchDraw(canvas);
                vi0 vi0Var = this.f33950b;
                hi0 hi0Var = vi0Var.f38727a0;
                hi0Var.e(canvas);
                ArrayList arrayList = hi0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    bz bzVar = (bz) hg.c.g(1, arrayList);
                    ImageReceiver imageReceiver = bzVar.f32526r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (bzVar.f32527s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                bzVar.f32527s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                bzVar.f32527s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (bzVar.f32527s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(bzVar.f32527s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    vi0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!hi0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                vi0 vi0Var2 = this.f33950b;
                eb0 eb0Var = vi0Var2.d;
                if (eb0Var != null) {
                    if (vi0Var2.E == 1.0f && vi0Var2.f38742n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eb0Var.a(z10);
                }
                if (vi0Var2.E > 0.0f && vi0Var2.f38742n != null) {
                    vi0Var2.f38747r.reset();
                    float width = getWidth() / vi0Var2.f38734f.getWidth();
                    vi0Var2.f38747r.postScale(width, width);
                    vi0Var2.h.setLocalMatrix(vi0Var2.f38747r);
                    vi0Var2.f38742n.setAlpha((int) (vi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), vi0Var2.f38742n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f33949a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f33950b.onBackPressed();
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
        ii0 ii0Var;
        int height;
        switch (this.f33949a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                vi0 vi0Var = this.f33950b;
                if (!vi0Var.f38736g0 || vi0Var.f38737h0) {
                    ArrayList arrayList = vi0Var.N;
                    oi0 oi0Var = vi0Var.K;
                    if (vi0Var.F.getWidth() > 0) {
                        vi0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.ok.D(6.0f, vi0Var.W.getWidth() - vi0Var.W.l(), iArr[0])};
                        vi0Var.X.setScaleX(vi0Var.W.getScaleX());
                        vi0Var.X.setScaleY(vi0Var.W.getScaleY());
                        int[] iArr2 = vi0Var.f38744o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = oi0Var.getMeasuredHeight() - vi0Var.X.getHeight();
                        if (vi0Var.f38733e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + vi0Var.e.f10577b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = vi0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (vi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - vi0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (vi0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - vi0Var.W.getHeight();
                        }
                        vi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ii0Var.getWidth() - vi0Var.X.l())));
                        vi0Var.X.setY(iArr[1]);
                        if (vi0Var.m0) {
                            iArr[0] = iArr[0] - (vi0Var.Y - vi0Var.W.l());
                        }
                        oi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - oi0Var.getMeasuredWidth());
                        if (vi0Var.f38736g0) {
                            org.telegram.messenger.ok.s(oi0Var.animate().translationY(((vi0Var.X.getHeight() + iArr[1]) - oi0Var.getMeasuredHeight()) - oi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            oi0Var.setY((vi0Var.X.getHeight() + iArr[1]) - oi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = vi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - vi0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = vi0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = vi0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = vi0Var.f38732d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.f0.b(6.0f, (vi0Var.X.l() + iArr[0]) - vi0Var.f38732d0.getMeasuredWidth(), 0));
                            RectF rectF = vi0Var.f38741l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = vi0Var.f38732d0;
                                float max = Math.max(vi0Var.e.f10577b, rectF.top - frameLayout2.getMeasuredWidth());
                                vi0Var.f38731c0 = max;
                                frameLayout2.setY(max);
                                ji0 ji0Var = vi0Var.f38733e0;
                                if (ji0Var != null) {
                                    ji0Var.setY(Math.max(vi0Var.e.f10577b, (vi0Var.f38741l0.top - AndroidUtilities.dp(24.0f)) - vi0Var.f38733e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (vi0Var.X.getHeight() + iArr[1]) - oi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = vi0Var.f38732d0;
                                float max2 = Math.max(vi0Var.e.f10577b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                vi0Var.f38731c0 = max2;
                                frameLayout3.setY(max2);
                                ji0 ji0Var2 = vi0Var.f38733e0;
                                if (ji0Var2 != null) {
                                    ji0Var2.setY(Math.max(0.0f, (height2 - ji0Var2.getMeasuredHeight()) - vi0Var.f38731c0));
                                }
                            }
                        }
                    }
                    vi0Var.f38736g0 = true;
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
        switch (this.f33949a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                vi0 vi0Var = this.f33950b;
                gh.d.c(vi0Var.f38739j0, vi0Var.F);
                ViewGroup viewGroup = vi0Var.Z;
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
