package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class xw0 extends ml0 {
    public static final vw0 f30003x3 = new CacheFetcher();
    public static final ww0 y3 = new CacheFetcher();
    public float X2;
    public tw0[] Y2;
    public final ow0 Z2;
    public final c6 f30004a3;
    public Drawable f30005b3;
    public Drawable f30006c3;
    public Paint f30007d3;
    public final Paint f30008e3;
    public int f30009f3;
    public int f30010g3;
    public Utilities.Callback f30011h3;
    public Utilities.Callback f30012i3;
    public boolean j3;
    public boolean f30013k3;
    public ci.eb f30014l3;
    public int f30015m3;
    public Utilities.Callback f30016n3;
    public float f30017o3;
    public ValueAnimator f30018p3;
    public boolean f30019q3;
    public final c6 f30020r3;
    public final c6 f30021s3;
    public final RectF f30022t3;
    public final RectF f30023u3;
    public final RectF f30024v3;
    public boolean f30025w3;

    static {
        new HashSet();
    }

    public xw0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        qr qrVar = qr.h;
        this.f30004a3 = new c6(this, 360L, qrVar);
        Paint paint = new Paint(1);
        this.f30008e3 = paint;
        this.f30015m3 = -1;
        this.f30017o3 = 0.0f;
        this.f30019q3 = true;
        this.f30020r3 = new c6(this, 350L, qrVar);
        this.f30021s3 = new c6(this, 350L, qrVar);
        this.f30022t3 = new RectF();
        this.f30023u3 = new RectF();
        this.f30024v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        ow0 ow0Var = new ow0(this);
        this.Z2 = ow0Var;
        setAdapter(ow0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.j6.f18953i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f26194p2));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f26194p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f30003x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.s9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof sw0) {
            sw0 sw0Var = (sw0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, sw0Var.E, 0.15f, 0.85f) * sw0Var.f27944y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof sw0) {
            return Math.max(0, getHeight() * (RecyclerView.S(childAt) - 1)) + this.f30009f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f30017o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof sw0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.S(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((sw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(xw0 xw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        xw0Var.Y2 = new tw0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            tw0[] tw0VarArr = xw0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f28217c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f28215a = "premium";
            } else {
                obj.f28215a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f28216b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            tw0VarArr[i10] = obj;
        }
        xw0Var.Y2 = xw0Var.C1(xw0Var.Y2);
        xw0Var.Z2.l();
        xw0Var.setCategoriesShownT(0.0f);
        boolean z11 = xw0Var.f30019q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        xw0Var.H1(z11, z10);
    }

    public static void z1(xw0 xw0Var, float f7) {
        xw0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f30015m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f30010g3));
        scrollBy(dp, 0);
        post(new id((ci.k2) this, dp, 10));
    }

    public final void E1() {
        w0(-getScrollToStartWidth(), 0, qr.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f30015m3 < 0 && i10 >= 0) {
            this.f30021s3.d(i10, true);
        }
        this.f30015m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof sw0) {
                int S = RecyclerView.S(childAt);
                sw0 sw0Var = (sw0) childAt;
                if (this.f30015m3 == S - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sw0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(tw0 tw0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                tw0[] tw0VarArr = this.Y2;
                if (i10 >= tw0VarArr.length) {
                    break;
                } else if (tw0VarArr[i10] == tw0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            F1(i10);
        }
        i10 = -1;
        F1(i10);
    }

    public final void H1(boolean z10, boolean z11) {
        int length;
        this.f30019q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f30017o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f30018p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30018p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f30017o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30018p3 = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 23));
            this.f30018p3.addListener(new jd0(this, 16));
            this.f30018p3.setInterpolator(qr.h);
            ValueAnimator valueAnimator2 = this.f30018p3;
            tw0[] tw0VarArr = this.Y2;
            if (tw0VarArr == null) {
                length = 5;
            } else {
                length = tw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f30018p3.start();
            return;
        }
        if (r52 != 0) {
            f7 = 1.0f;
        }
        setCategoriesShownT(f7);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View F = F(motionEvent.getX(), motionEvent.getY());
            if (!(F instanceof sw0) || F.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xw0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f30015m3;
    }

    public tw0 getSelectedCategory() {
        int i10;
        tw0[] tw0VarArr = this.Y2;
        if (tw0VarArr != null && (i10 = this.f30015m3) >= 0 && i10 < tw0VarArr.length) {
            return tw0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void l0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof sw0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f30010g3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.j3;
        if (z12 != z11) {
            this.j3 = z11;
            Utilities.Callback callback2 = this.f30011h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f30009f3 - this.f30010g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f30011h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f30009f3 - this.f30010g3))));
        }
        if (this.f30013k3 != z10) {
            this.f30013k3 = z10;
            Utilities.Callback callback3 = this.f30012i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f30019q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.eb ebVar = this.f30014l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f30007d3 == null) {
            this.f30007d3 = new Paint(1);
        }
        this.f30007d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f30005b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f30006c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f30010g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<tw0> callback) {
        this.f30016n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f30012i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f30011h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public tw0[] C1(tw0[] tw0VarArr) {
        return tw0VarArr;
    }
}
