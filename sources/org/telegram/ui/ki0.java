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
public final class ki0 extends FrameLayout {
    public final int f37995a;
    public final zi0 f37996b;

    public ki0(zi0 zi0Var, Context context, int i10) {
        super(context);
        this.f37995a = i10;
        this.f37996b = zi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f37995a) {
            case 0:
                super.dispatchDraw(canvas);
                zi0 zi0Var = this.f37996b;
                li0 li0Var = zi0Var.f43800a0;
                li0Var.e(canvas);
                ArrayList arrayList = li0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) hg.c.g(1, arrayList);
                    ImageReceiver imageReceiver = fzVar.f36451r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (fzVar.f36452s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                fzVar.f36452s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                fzVar.f36452s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (fzVar.f36452s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(fzVar.f36452s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    zi0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!li0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                zi0 zi0Var2 = this.f37996b;
                ib0 ib0Var = zi0Var2.d;
                if (ib0Var != null) {
                    if (zi0Var2.E == 1.0f && zi0Var2.f43816n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ib0Var.a(z10);
                }
                if (zi0Var2.E > 0.0f && zi0Var2.f43816n != null) {
                    zi0Var2.f43821r.reset();
                    float width = getWidth() / zi0Var2.f43808f.getWidth();
                    zi0Var2.f43821r.postScale(width, width);
                    zi0Var2.h.setLocalMatrix(zi0Var2.f43821r);
                    zi0Var2.f43816n.setAlpha((int) (zi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zi0Var2.f43816n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f37995a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f37996b.onBackPressed();
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
        mi0 mi0Var;
        int height;
        switch (this.f37995a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                zi0 zi0Var = this.f37996b;
                if (!zi0Var.f43810g0 || zi0Var.f43811h0) {
                    ArrayList arrayList = zi0Var.N;
                    si0 si0Var = zi0Var.K;
                    if (zi0Var.F.getWidth() > 0) {
                        zi0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.bi.D(6.0f, zi0Var.W.getWidth() - zi0Var.W.l(), iArr[0])};
                        zi0Var.X.setScaleX(zi0Var.W.getScaleX());
                        zi0Var.X.setScaleY(zi0Var.W.getScaleY());
                        int[] iArr2 = zi0Var.f43818o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = si0Var.getMeasuredHeight() - zi0Var.X.getHeight();
                        if (zi0Var.f43807e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + zi0Var.f43806e.f11527b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = zi0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (zi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - zi0Var.f43806e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (zi0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - zi0Var.W.getHeight();
                        }
                        zi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (mi0Var.getWidth() - zi0Var.X.l())));
                        zi0Var.X.setY(iArr[1]);
                        if (zi0Var.m0) {
                            iArr[0] = iArr[0] - (zi0Var.Y - zi0Var.W.l());
                        }
                        si0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - si0Var.getMeasuredWidth());
                        if (zi0Var.f43810g0) {
                            org.telegram.messenger.bi.r(si0Var.animate().translationY(((zi0Var.X.getHeight() + iArr[1]) - si0Var.getMeasuredHeight()) - si0Var.getTop()), ji.n.V, 250L);
                        } else {
                            si0Var.setY((zi0Var.X.getHeight() + iArr[1]) - si0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = zi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - zi0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = zi0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = zi0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = zi0Var.f43805d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.q.b(6.0f, (zi0Var.X.l() + iArr[0]) - zi0Var.f43805d0.getMeasuredWidth(), 0));
                            RectF rectF = zi0Var.f43815l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = zi0Var.f43805d0;
                                float max = Math.max(zi0Var.f43806e.f11527b, rectF.top - frameLayout2.getMeasuredWidth());
                                zi0Var.f43804c0 = max;
                                frameLayout2.setY(max);
                                ni0 ni0Var = zi0Var.f43807e0;
                                if (ni0Var != null) {
                                    ni0Var.setY(Math.max(zi0Var.f43806e.f11527b, (zi0Var.f43815l0.top - AndroidUtilities.dp(24.0f)) - zi0Var.f43807e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (zi0Var.X.getHeight() + iArr[1]) - si0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = zi0Var.f43805d0;
                                float max2 = Math.max(zi0Var.f43806e.f11527b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                zi0Var.f43804c0 = max2;
                                frameLayout3.setY(max2);
                                ni0 ni0Var2 = zi0Var.f43807e0;
                                if (ni0Var2 != null) {
                                    ni0Var2.setY(Math.max(0.0f, (height2 - ni0Var2.getMeasuredHeight()) - zi0Var.f43804c0));
                                }
                            }
                        }
                    }
                    zi0Var.f43810g0 = true;
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
        switch (this.f37995a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                zi0 zi0Var = this.f37996b;
                gh.d.c(zi0Var.f43813j0, zi0Var.F);
                ViewGroup viewGroup = zi0Var.Z;
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
