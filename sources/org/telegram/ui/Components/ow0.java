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
public abstract class ow0 extends jl0 {
    public static final mw0 f31488t3 = new CacheFetcher();
    public static final nw0 f31489u3 = new CacheFetcher();
    public float T2;
    public kw0[] U2;
    public final fw0 V2;
    public final d6 W2;
    public Drawable X2;
    public Drawable Y2;
    public Paint Z2;
    public final Paint f31490a3;
    public int f31491b3;
    public int c3;
    public Utilities.Callback f31492d3;
    public Utilities.Callback f31493e3;
    public boolean f31494f3;
    public boolean f31495g3;
    public cg.h0 f31496h3;
    public int f31497i3;
    public Utilities.Callback f31498j3;
    public float f31499k3;
    public ValueAnimator f31500l3;
    public boolean f31501m3;
    public final d6 f31502n3;
    public final d6 f31503o3;
    public final RectF f31504p3;
    public final RectF f31505q3;
    public final RectF f31506r3;
    public boolean f31507s3;

    static {
        new HashSet();
    }

    public ow0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = 6.5f;
        this.U2 = null;
        jr jrVar = jr.h;
        this.W2 = new d6(this, 360L, jrVar);
        Paint paint = new Paint(1);
        this.f31490a3 = paint;
        this.f31497i3 = -1;
        this.f31499k3 = 0.0f;
        this.f31501m3 = true;
        this.f31502n3 = new d6(this, 350L, jrVar);
        this.f31503o3 = new d6(this, 350L, jrVar);
        this.f31504p3 = new RectF();
        this.f31505q3 = new RectF();
        this.f31506r3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        fw0 fw0Var = new fw0(this);
        this.V2 = fw0Var;
        setAdapter(fw0Var);
        f2.j0 j0Var = new f2.j0();
        setLayoutManager(j0Var);
        j0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.g6.f23152i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f29709l2));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f29709l2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f31488t3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new nh.q8(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof jw0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f31491b3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f9) {
        this.f31499k3 = f9;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof jw0) {
                float cascade = AndroidUtilities.cascade(f9, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((jw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(ow0 ow0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        ow0Var.U2 = new kw0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            kw0[] kw0VarArr = ow0Var.U2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f30160c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f30158a = "premium";
            } else {
                obj.f30158a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f30159b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            kw0VarArr[i10] = obj;
        }
        ow0Var.U2 = ow0Var.B1(ow0Var.U2);
        ow0Var.V2.l();
        ow0Var.setCategoriesShownT(0.0f);
        boolean z11 = ow0Var.f31501m3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        ow0Var.G1(z11, z10);
    }

    public static void y1(ow0 ow0Var, float f9) {
        ow0Var.setCategoriesShownT(f9);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f9 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof jw0) {
            jw0 jw0Var = (jw0) view;
            f9 = com.google.android.recaptcha.internal.a.z(1.0f, jw0Var.A, 0.15f, 0.85f) * jw0Var.f29839y;
        }
        float f10 = width * f9;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f31497i3) + ((-getScrollToStartWidth()) - Math.max(0, this.c3));
        scrollBy(dp, 0);
        post(new i8((nh.c2) this, dp, 11));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, jr.h);
    }

    public void E1(int i10) {
        boolean z10;
        if (this.f31497i3 < 0 && i10 >= 0) {
            this.f31503o3.d(i10, true);
        }
        this.f31497i3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof jw0) {
                int R = RecyclerView.R(childAt);
                jw0 jw0Var = (jw0) childAt;
                if (this.f31497i3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jw0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void F1(kw0 kw0Var) {
        int i10;
        if (this.U2 != null) {
            i10 = 0;
            while (true) {
                kw0[] kw0VarArr = this.U2;
                if (i10 >= kw0VarArr.length) {
                    break;
                } else if (kw0VarArr[i10] == kw0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            E1(i10);
        }
        i10 = -1;
        E1(i10);
    }

    public final void G1(boolean z10, boolean z11) {
        int length;
        this.f31501m3 = z10;
        ?? r52 = z10;
        if (this.U2 == null) {
            r52 = 0;
        }
        if (this.f31499k3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f31500l3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31500l3 = null;
        }
        float f9 = 0.0f;
        if (z11) {
            float f10 = this.f31499k3;
            if (r52 != 0) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f31500l3 = ofFloat;
            ofFloat.addUpdateListener(new d70(this, 23));
            this.f31500l3.addListener(new zz(this, 24));
            this.f31500l3.setInterpolator(jr.h);
            ValueAnimator valueAnimator2 = this.f31500l3;
            kw0[] kw0VarArr = this.U2;
            if (kw0VarArr == null) {
                length = 5;
            } else {
                length = kw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f31500l3.start();
            return;
        }
        if (r52 != 0) {
            f9 = 1.0f;
        }
        setCategoriesShownT(f9);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof jw0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ow0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f31497i3;
    }

    public kw0 getSelectedCategory() {
        int i10;
        kw0[] kw0VarArr = this.U2;
        if (kw0VarArr != null && (i10 = this.f31497i3) >= 0 && i10 < kw0VarArr.length) {
            return kw0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof jw0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.c3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f31494f3;
        if (z12 != z11) {
            this.f31494f3 = z11;
            Utilities.Callback callback2 = this.f31492d3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f31491b3 - this.c3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f31492d3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f31491b3 - this.c3))));
        }
        if (this.f31495g3 != z10) {
            this.f31495g3 = z10;
            Utilities.Callback callback3 = this.f31493e3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.f31501m3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cg.h0 h0Var = this.f31496h3;
        if (h0Var != null) {
            h0Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.Z2 == null) {
            this.Z2 = new Paint(1);
        }
        this.Z2.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.X2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.Y2 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.c3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<kw0> callback) {
        this.f31498j3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f31493e3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f31492d3 = callback;
    }

    public void setShownButtonsAtStart(float f9) {
        this.T2 = f9;
    }

    public kw0[] B1(kw0[] kw0VarArr) {
        return kw0VarArr;
    }
}
