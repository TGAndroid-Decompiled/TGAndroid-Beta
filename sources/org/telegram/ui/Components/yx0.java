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
public abstract class yx0 extends qm0 {
    public static final wx0 f33381v3 = new CacheFetcher();
    public static final xx0 f33382w3 = new CacheFetcher();
    public float V2;
    public ux0[] W2;
    public final px0 X2;
    public final g6 Y2;
    public Drawable Z2;
    public Drawable f33383a3;
    public Paint f33384b3;
    public final Paint f33385c3;
    public int f33386d3;
    public int f33387e3;
    public Utilities.Callback f33388f3;
    public Utilities.Callback f33389g3;
    public boolean f33390h3;
    public boolean f33391i3;
    public ci.bb j3;
    public int f33392k3;
    public Utilities.Callback f33393l3;
    public float f33394m3;
    public ValueAnimator f33395n3;
    public boolean f33396o3;
    public final g6 f33397p3;
    public final g6 f33398q3;
    public final RectF f33399r3;
    public final RectF f33400s3;
    public final RectF f33401t3;
    public boolean f33402u3;

    static {
        new HashSet();
    }

    public yx0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V2 = 6.5f;
        this.W2 = null;
        hs hsVar = hs.h;
        this.Y2 = new g6(this, 360L, hsVar);
        Paint paint = new Paint(1);
        this.f33385c3 = paint;
        this.f33392k3 = -1;
        this.f33394m3 = 0.0f;
        this.f33396o3 = true;
        this.f33397p3 = new g6(this, 350L, hsVar);
        this.f33398q3 = new g6(this, 350L, hsVar);
        this.f33399r3 = new RectF();
        this.f33400s3 = new RectF();
        this.f33401t3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        px0 px0Var = new px0(this);
        this.X2 = px0Var;
        setAdapter(px0Var);
        s4.d0 d0Var = new s4.d0();
        setLayoutManager(d0Var);
        d0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.i6.f20888i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f30216n2));
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f30216n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f33381v3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.p9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof tx0) {
            tx0 tx0Var = (tx0) view;
            f7 = com.google.android.gms.internal.vision.e2.y(1.0f, tx0Var.E, 0.15f, 0.85f) * tx0Var.f31303y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof tx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f33386d3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f33394m3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof tx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((tx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(yx0 yx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        yx0Var.W2 = new ux0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            ux0[] ux0VarArr = yx0Var.W2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f31636c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f31634a = "premium";
            } else {
                obj.f31634a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f31635b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            ux0VarArr[i10] = obj;
        }
        yx0Var.W2 = yx0Var.C1(yx0Var.W2);
        yx0Var.X2.l();
        yx0Var.setCategoriesShownT(0.0f);
        boolean z11 = yx0Var.f33396o3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        yx0Var.H1(z11, z10);
    }

    public static void z1(yx0 yx0Var, float f7) {
        yx0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f33392k3) + ((-getScrollToStartWidth()) - Math.max(0, this.f33387e3));
        scrollBy(dp, 0);
        post(new nd((ci.j2) this, dp, 10));
    }

    public final void E1() {
        v0(-getScrollToStartWidth(), 0, hs.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f33392k3 < 0 && i10 >= 0) {
            this.f33398q3.d(i10, true);
        }
        this.f33392k3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof tx0) {
                int R = RecyclerView.R(childAt);
                tx0 tx0Var = (tx0) childAt;
                if (this.f33392k3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(ux0 ux0Var) {
        int i10;
        if (this.W2 != null) {
            i10 = 0;
            while (true) {
                ux0[] ux0VarArr = this.W2;
                if (i10 >= ux0VarArr.length) {
                    break;
                } else if (ux0VarArr[i10] == ux0Var) {
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
        this.f33396o3 = z10;
        ?? r52 = z10;
        if (this.W2 == null) {
            r52 = 0;
        }
        if (this.f33394m3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f33395n3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33395n3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f33394m3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33395n3 = ofFloat;
            ofFloat.addUpdateListener(new j80(this, 24));
            this.f33395n3.addListener(new vd0(this, 17));
            this.f33395n3.setInterpolator(hs.h);
            ValueAnimator valueAnimator2 = this.f33395n3;
            ux0[] ux0VarArr = this.W2;
            if (ux0VarArr == null) {
                length = 5;
            } else {
                length = ux0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f33395n3.start();
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
            if (!(E instanceof tx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f33392k3;
    }

    public ux0 getSelectedCategory() {
        int i10;
        ux0[] ux0VarArr = this.W2;
        if (ux0VarArr != null && (i10 = this.f33392k3) >= 0 && i10 < ux0VarArr.length) {
            return ux0VarArr[i10];
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
            if (childAt instanceof tx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f33387e3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f33390h3;
        if (z12 != z11) {
            this.f33390h3 = z11;
            Utilities.Callback callback2 = this.f33388f3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f33386d3 - this.f33387e3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f33388f3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f33386d3 - this.f33387e3))));
        }
        if (this.f33391i3 != z10) {
            this.f33391i3 = z10;
            Utilities.Callback callback3 = this.f33389g3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f33396o3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.bb bbVar = this.j3;
        if (bbVar != null) {
            bbVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f33384b3 == null) {
            this.f33384b3 = new Paint(1);
        }
        this.f33384b3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.Z2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f33383a3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f33387e3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<ux0> callback) {
        this.f33393l3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f33389g3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f33388f3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.V2 = f7;
    }

    public ux0[] C1(ux0[] ux0VarArr) {
        return ux0VarArr;
    }
}
