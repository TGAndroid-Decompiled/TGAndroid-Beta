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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class by0 extends mm0 implements org.telegram.ui.ActionBar.p6 {
    public static final zx0 F3 = new CacheFetcher();
    public static final ay0 G3 = new CacheFetcher();
    public final h6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f26978f3;
    public xx0[] f26979g3;
    public final sx0 f26980h3;
    public final h6 f26981i3;
    public Drawable f26982j3;
    public Drawable f26983k3;
    public Paint f26984l3;
    public final Paint f26985m3;
    public int f26986n3;
    public int f26987o3;
    public Utilities.Callback f26988p3;
    public Utilities.Callback f26989q3;
    public boolean f26990r3;
    public boolean f26991s3;
    public bi.cc f26992t3;
    public int f26993u3;
    public Utilities.Callback f26994v3;
    public float f26995w3;
    public ValueAnimator f26996x3;
    public boolean y3;
    public final h6 f26997z3;

    static {
        new HashSet();
    }

    public by0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f26978f3 = 6.5f;
        this.f26979g3 = null;
        ds dsVar = ds.h;
        this.f26981i3 = new h6(this, 360L, dsVar);
        Paint paint = new Paint(1);
        this.f26985m3 = paint;
        this.f26993u3 = -1;
        this.f26995w3 = 0.0f;
        this.y3 = true;
        this.f26997z3 = new h6(this, 350L, dsVar);
        this.A3 = new h6(this, 350L, dsVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        sx0 sx0Var = new sx0(this);
        this.f26980h3 = sx0Var;
        setAdapter(sx0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.k1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.ActionBar.f7.m(this, 20, i11, u6Var);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.f30644n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new fi.y8(this, currentTimeMillis, 2));
    }

    public static void D1(by0 by0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        by0Var.f26979g3 = new xx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            xx0[] xx0VarArr = by0Var.f26979g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f34844c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f34842a = "premium";
            } else {
                obj.f34842a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f34843b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            xx0VarArr[i10] = obj;
        }
        by0Var.f26979g3 = by0Var.H1(by0Var.f26979g3);
        by0Var.f26980h3.l();
        by0Var.setCategoriesShownT(0.0f);
        boolean z11 = by0Var.y3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        by0Var.M1(z11, z10);
    }

    public static void E1(by0 by0Var, float f7) {
        by0Var.setCategoriesShownT(f7);
    }

    public static void F1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof wx0) {
            wx0 wx0Var = (wx0) view;
            f7 = c3.h0.z(1.0f, wx0Var.E, 0.15f, 0.85f) * wx0Var.f34547y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof wx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f26986n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f26995w3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof wx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((wx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public abstract boolean G1();

    public final void I1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f26993u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f26987o3));
        scrollBy(dp, 0);
        post(new mp0((fi.e2) this, dp));
    }

    public final void J1() {
        w0(-getScrollToStartWidth(), 0, ds.h);
    }

    public void K1(int i10) {
        boolean z10;
        if (this.f26993u3 < 0 && i10 >= 0) {
            this.A3.d(i10, true);
        }
        this.f26993u3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof wx0) {
                int R = RecyclerView.R(childAt);
                wx0 wx0Var = (wx0) childAt;
                if (this.f26993u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void L1(xx0 xx0Var) {
        int i10;
        if (this.f26979g3 != null) {
            i10 = 0;
            while (true) {
                xx0[] xx0VarArr = this.f26979g3;
                if (i10 >= xx0VarArr.length) {
                    break;
                } else if (xx0VarArr[i10] == xx0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            K1(i10);
        }
        i10 = -1;
        K1(i10);
    }

    public final void M1(boolean z10, boolean z11) {
        int length;
        this.y3 = z10;
        ?? r52 = z10;
        if (this.f26979g3 == null) {
            r52 = 0;
        }
        if (this.f26995w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f26996x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26996x3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f26995w3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f26996x3 = ofFloat;
            ofFloat.addUpdateListener(new e80(this, 23));
            this.f26996x3.addListener(new i10(this, 24));
            this.f26996x3.setInterpolator(ds.h);
            ValueAnimator valueAnimator2 = this.f26996x3;
            xx0[] xx0VarArr = this.f26979g3;
            if (xx0VarArr == null) {
                length = 5;
            } else {
                length = xx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f26996x3.start();
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
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof wx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.by0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f26993u3;
    }

    public xx0 getSelectedCategory() {
        int i10;
        xx0[] xx0VarArr = this.f26979g3;
        if (xx0VarArr != null && (i10 = this.f26993u3) >= 0 && i10 < xx0VarArr.length) {
            return xx0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void l0(int i10) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i11 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof wx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f26987o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f26990r3;
        if (z12 != z11) {
            this.f26990r3 = z11;
            Utilities.Callback callback2 = this.f26988p3;
            if (callback2 != null) {
                if (z11) {
                    i11 = Math.max(0, getScrollToStartWidth() - (this.f26986n3 - this.f26987o3));
                }
                callback2.run(Integer.valueOf(i11));
            }
            invalidate();
        } else if (z12 && (callback = this.f26988p3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f26986n3 - this.f26987o3))));
        }
        if (this.f26991s3 != z10) {
            this.f26991s3 = z10;
            Utilities.Callback callback3 = this.f26989q3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M1(this.y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.cc ccVar = this.f26992t3;
        if (ccVar != null) {
            ccVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f26984l3 == null) {
            this.f26984l3 = new Paint(1);
        }
        this.f26984l3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f26982j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f26983k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f26987o3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<xx0> callback) {
        this.f26994v3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f26989q3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f26988p3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.f26978f3 = f7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f26985m3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23446i6, this.f30644n2));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public xx0[] H1(xx0[] xx0VarArr) {
        return xx0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
