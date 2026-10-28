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
public abstract class cy0 extends nm0 implements org.telegram.ui.ActionBar.p6 {
    public static final ay0 F3 = new CacheFetcher();
    public static final by0 G3 = new CacheFetcher();
    public final h6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f27275f3;
    public yx0[] f27276g3;
    public final tx0 f27277h3;
    public final h6 f27278i3;
    public Drawable f27279j3;
    public Drawable f27280k3;
    public Paint f27281l3;
    public final Paint f27282m3;
    public int f27283n3;
    public int f27284o3;
    public Utilities.Callback f27285p3;
    public Utilities.Callback f27286q3;
    public boolean f27287r3;
    public boolean f27288s3;
    public bi.cc f27289t3;
    public int f27290u3;
    public Utilities.Callback f27291v3;
    public float f27292w3;
    public ValueAnimator f27293x3;
    public boolean y3;
    public final h6 f27294z3;

    static {
        new HashSet();
    }

    public cy0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f27275f3 = 6.5f;
        this.f27276g3 = null;
        ds dsVar = ds.h;
        this.f27278i3 = new h6(this, 360L, dsVar);
        Paint paint = new Paint(1);
        this.f27282m3 = paint;
        this.f27290u3 = -1;
        this.f27292w3 = 0.0f;
        this.y3 = true;
        this.f27294z3 = new h6(this, 350L, dsVar);
        this.A3 = new h6(this, 350L, dsVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        tx0 tx0Var = new tx0(this);
        this.f27277h3 = tx0Var;
        setAdapter(tx0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.k1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.ActionBar.f7.m(this, 20, i11, u6Var);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.f30988n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new fi.y8(this, currentTimeMillis, 2));
    }

    public static void D1(cy0 cy0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        cy0Var.f27276g3 = new yx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            yx0[] yx0VarArr = cy0Var.f27276g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f35184c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f35182a = "premium";
            } else {
                obj.f35182a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f35183b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            yx0VarArr[i10] = obj;
        }
        cy0Var.f27276g3 = cy0Var.H1(cy0Var.f27276g3);
        cy0Var.f27277h3.l();
        cy0Var.setCategoriesShownT(0.0f);
        boolean z11 = cy0Var.y3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        cy0Var.M1(z11, z10);
    }

    public static void E1(cy0 cy0Var, float f7) {
        cy0Var.setCategoriesShownT(f7);
    }

    public static void F1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof xx0) {
            xx0 xx0Var = (xx0) view;
            f7 = c3.h0.z(1.0f, xx0Var.E, 0.15f, 0.85f) * xx0Var.f34874y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof xx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f27283n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f27292w3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof xx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((xx0) childAt).j();
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
        int dp = (AndroidUtilities.dp(34.0f) * this.f27290u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f27284o3));
        scrollBy(dp, 0);
        post(new np0((fi.e2) this, dp));
    }

    public final void J1() {
        w0(-getScrollToStartWidth(), 0, ds.h);
    }

    public void K1(int i10) {
        boolean z10;
        if (this.f27290u3 < 0 && i10 >= 0) {
            this.A3.d(i10, true);
        }
        this.f27290u3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof xx0) {
                int R = RecyclerView.R(childAt);
                xx0 xx0Var = (xx0) childAt;
                if (this.f27290u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void L1(yx0 yx0Var) {
        int i10;
        if (this.f27276g3 != null) {
            i10 = 0;
            while (true) {
                yx0[] yx0VarArr = this.f27276g3;
                if (i10 >= yx0VarArr.length) {
                    break;
                } else if (yx0VarArr[i10] == yx0Var) {
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
        if (this.f27276g3 == null) {
            r52 = 0;
        }
        if (this.f27292w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f27293x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f27293x3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f27292w3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f27293x3 = ofFloat;
            ofFloat.addUpdateListener(new f80(this, 23));
            this.f27293x3.addListener(new i10(this, 24));
            this.f27293x3.setInterpolator(ds.h);
            ValueAnimator valueAnimator2 = this.f27293x3;
            yx0[] yx0VarArr = this.f27276g3;
            if (yx0VarArr == null) {
                length = 5;
            } else {
                length = yx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f27293x3.start();
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
            if (!(E instanceof xx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cy0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f27290u3;
    }

    public yx0 getSelectedCategory() {
        int i10;
        yx0[] yx0VarArr = this.f27276g3;
        if (yx0VarArr != null && (i10 = this.f27290u3) >= 0 && i10 < yx0VarArr.length) {
            return yx0VarArr[i10];
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
            if (childAt instanceof xx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f27284o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f27287r3;
        if (z12 != z11) {
            this.f27287r3 = z11;
            Utilities.Callback callback2 = this.f27285p3;
            if (callback2 != null) {
                if (z11) {
                    i11 = Math.max(0, getScrollToStartWidth() - (this.f27283n3 - this.f27284o3));
                }
                callback2.run(Integer.valueOf(i11));
            }
            invalidate();
        } else if (z12 && (callback = this.f27285p3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f27283n3 - this.f27284o3))));
        }
        if (this.f27288s3 != z10) {
            this.f27288s3 = z10;
            Utilities.Callback callback3 = this.f27286q3;
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
        bi.cc ccVar = this.f27289t3;
        if (ccVar != null) {
            ccVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f27281l3 == null) {
            this.f27281l3 = new Paint(1);
        }
        this.f27281l3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f27279j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f27280k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f27284o3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<yx0> callback) {
        this.f27291v3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f27286q3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f27285p3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.f27275f3 = f7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f27282m3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, this.f30988n2));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public yx0[] H1(yx0[] yx0VarArr) {
        return yx0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
