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
public abstract class sx0 extends zl0 {
    public static final qx0 E3 = new CacheFetcher();
    public static final rx0 F3 = new CacheFetcher();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float f30958e3;
    public ox0[] f30959f3;
    public final jx0 f30960g3;
    public final e6 f30961h3;
    public Drawable f30962i3;
    public Drawable j3;
    public Paint f30963k3;
    public final Paint f30964l3;
    public int f30965m3;
    public int f30966n3;
    public Utilities.Callback f30967o3;
    public Utilities.Callback f30968p3;
    public boolean f30969q3;
    public boolean f30970r3;
    public ci.ab f30971s3;
    public int f30972t3;
    public Utilities.Callback f30973u3;
    public float f30974v3;
    public ValueAnimator f30975w3;
    public boolean f30976x3;
    public final e6 y3;
    public final e6 f30977z3;

    static {
        new HashSet();
    }

    public sx0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f30958e3 = 6.5f;
        this.f30959f3 = null;
        tr trVar = tr.h;
        this.f30961h3 = new e6(this, 360L, trVar);
        Paint paint = new Paint(1);
        this.f30964l3 = paint;
        this.f30972t3 = -1;
        this.f30974v3 = 0.0f;
        this.f30976x3 = true;
        this.y3 = new e6(this, 350L, trVar);
        this.f30977z3 = new e6(this, 350L, trVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        jx0 jx0Var = new jx0(this);
        this.f30960g3 = jx0Var;
        setAdapter(jx0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.i6.f20918i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f33560p2));
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f33560p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.o9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof nx0) {
            nx0 nx0Var = (nx0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, nx0Var.E, 0.15f, 0.85f) * nx0Var.f29170y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof nx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f30965m3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f30974v3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof nx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((nx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(sx0 sx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        sx0Var.f30959f3 = new ox0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            ox0[] ox0VarArr = sx0Var.f30959f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f29559c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f29557a = "premium";
            } else {
                obj.f29557a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f29558b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            ox0VarArr[i10] = obj;
        }
        sx0Var.f30959f3 = sx0Var.C1(sx0Var.f30959f3);
        sx0Var.f30960g3.l();
        sx0Var.setCategoriesShownT(0.0f);
        boolean z11 = sx0Var.f30976x3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        sx0Var.H1(z11, z10);
    }

    public static void z1(sx0 sx0Var, float f7) {
        sx0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f30972t3) + ((-getScrollToStartWidth()) - Math.max(0, this.f30966n3));
        scrollBy(dp, 0);
        post(new gq0((ci.k2) this, dp));
    }

    public final void E1() {
        w0(-getScrollToStartWidth(), 0, tr.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f30972t3 < 0 && i10 >= 0) {
            this.f30977z3.d(i10, true);
        }
        this.f30972t3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof nx0) {
                int R = RecyclerView.R(childAt);
                nx0 nx0Var = (nx0) childAt;
                if (this.f30972t3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(ox0 ox0Var) {
        int i10;
        if (this.f30959f3 != null) {
            i10 = 0;
            while (true) {
                ox0[] ox0VarArr = this.f30959f3;
                if (i10 >= ox0VarArr.length) {
                    break;
                } else if (ox0VarArr[i10] == ox0Var) {
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
        this.f30976x3 = z10;
        ?? r52 = z10;
        if (this.f30959f3 == null) {
            r52 = 0;
        }
        if (this.f30974v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f30975w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30975w3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f30974v3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30975w3 = ofFloat;
            ofFloat.addUpdateListener(new v70(this, 23));
            this.f30975w3.addListener(new hd0(this, 17));
            this.f30975w3.setInterpolator(tr.h);
            ValueAnimator valueAnimator2 = this.f30975w3;
            ox0[] ox0VarArr = this.f30959f3;
            if (ox0VarArr == null) {
                length = 5;
            } else {
                length = ox0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f30975w3.start();
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
            if (!(E instanceof nx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f30972t3;
    }

    public ox0 getSelectedCategory() {
        int i10;
        ox0[] ox0VarArr = this.f30959f3;
        if (ox0VarArr != null && (i10 = this.f30972t3) >= 0 && i10 < ox0VarArr.length) {
            return ox0VarArr[i10];
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
            if (childAt instanceof nx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f30966n3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f30969q3;
        if (z12 != z11) {
            this.f30969q3 = z11;
            Utilities.Callback callback2 = this.f30967o3;
            if (callback2 != null) {
                if (z11) {
                    i11 = Math.max(0, getScrollToStartWidth() - (this.f30965m3 - this.f30966n3));
                }
                callback2.run(Integer.valueOf(i11));
            }
            invalidate();
        } else if (z12 && (callback = this.f30967o3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f30965m3 - this.f30966n3))));
        }
        if (this.f30970r3 != z10) {
            this.f30970r3 = z10;
            Utilities.Callback callback3 = this.f30968p3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f30976x3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.ab abVar = this.f30971s3;
        if (abVar != null) {
            abVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f30963k3 == null) {
            this.f30963k3 = new Paint(1);
        }
        this.f30963k3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f30962i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f30966n3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<ox0> callback) {
        this.f30973u3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f30968p3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f30967o3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.f30958e3 = f7;
    }

    public ox0[] C1(ox0[] ox0VarArr) {
        return ox0VarArr;
    }
}
