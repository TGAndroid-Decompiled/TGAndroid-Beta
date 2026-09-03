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
public abstract class xw0 extends sl0 {
    public static final vw0 f33190u3 = new CacheFetcher();
    public static final ww0 f33191v3 = new CacheFetcher();
    public float U2;
    public tw0[] V2;
    public final ow0 W2;
    public final z5 X2;
    public Drawable Y2;
    public Drawable Z2;
    public Paint f33192a3;
    public final Paint f33193b3;
    public int c3;
    public int f33194d3;
    public Utilities.Callback f33195e3;
    public Utilities.Callback f33196f3;
    public boolean f33197g3;
    public boolean f33198h3;
    public fg.h0 f33199i3;
    public int f33200j3;
    public Utilities.Callback f33201k3;
    public float f33202l3;
    public ValueAnimator f33203m3;
    public boolean f33204n3;
    public final z5 f33205o3;
    public final z5 f33206p3;
    public final RectF f33207q3;
    public final RectF f33208r3;
    public final RectF f33209s3;
    public boolean f33210t3;

    static {
        new HashSet();
    }

    public xw0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = 6.5f;
        this.V2 = null;
        pr prVar = pr.h;
        this.X2 = new z5(this, 360L, prVar);
        Paint paint = new Paint(1);
        this.f33193b3 = paint;
        this.f33200j3 = -1;
        this.f33202l3 = 0.0f;
        this.f33204n3 = true;
        this.f33205o3 = new z5(this, 350L, prVar);
        this.f33206p3 = new z5(this, 350L, prVar);
        this.f33207q3 = new RectF();
        this.f33208r3 = new RectF();
        this.f33209s3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        ow0 ow0Var = new ow0(this);
        this.W2 = ow0Var;
        setAdapter(ow0Var);
        f2.j0 j0Var = new f2.j0();
        setLayoutManager(j0Var);
        j0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.k6.f21752i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(i11, this.f31106m2));
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i11, this.f31106m2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f33190u3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new org.telegram.ui.ActionBar.b4(this, currentTimeMillis, 1));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof sw0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.c3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f33202l3 = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof sw0) {
                float cascade = AndroidUtilities.cascade(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
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

    public static void w1(xw0 xw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        xw0Var.V2 = new tw0[tL_messages_emojiGroups.groups.size()];
        boolean z4 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            tw0[] tw0VarArr = xw0Var.V2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f31424c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f31422a = "premium";
            } else {
                obj.f31422a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f31423b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            tw0VarArr[i10] = obj;
        }
        xw0Var.V2 = xw0Var.A1(xw0Var.V2);
        xw0Var.W2.l();
        xw0Var.setCategoriesShownT(0.0f);
        boolean z10 = xw0Var.f33204n3;
        if (System.currentTimeMillis() - j10 > 16) {
            z4 = true;
        }
        xw0Var.F1(z10, z4);
    }

    public static void x1(xw0 xw0Var, float f10) {
        xw0Var.setCategoriesShownT(f10);
    }

    public static void y1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof sw0) {
            sw0 sw0Var = (sw0) view;
            f10 = e2.c.w(1.0f, sw0Var.B, 0.15f, 0.85f) * sw0Var.f31195y;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    public final void B1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f33200j3) + ((-getScrollToStartWidth()) - Math.max(0, this.f33194d3));
        scrollBy(dp, 0);
        post(new im((qh.q1) this, dp, 8));
    }

    public final void C1() {
        v0(-getScrollToStartWidth(), 0, pr.h);
    }

    public void D1(int i10) {
        boolean z4;
        if (this.f33200j3 < 0 && i10 >= 0) {
            this.f33206p3.d(i10, true);
        }
        this.f33200j3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof sw0) {
                int R = RecyclerView.R(childAt);
                sw0 sw0Var = (sw0) childAt;
                if (this.f33200j3 == R - 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sw0Var.l(z4, true);
            }
        }
        invalidate();
    }

    public final void E1(tw0 tw0Var) {
        int i10;
        if (this.V2 != null) {
            i10 = 0;
            while (true) {
                tw0[] tw0VarArr = this.V2;
                if (i10 >= tw0VarArr.length) {
                    break;
                } else if (tw0VarArr[i10] == tw0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            D1(i10);
        }
        i10 = -1;
        D1(i10);
    }

    public final void F1(boolean z4, boolean z10) {
        int length;
        this.f33204n3 = z4;
        ?? r52 = z4;
        if (this.V2 == null) {
            r52 = 0;
        }
        if (this.f33202l3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f33203m3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33203m3 = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f33202l3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f33203m3 = ofFloat;
            ofFloat.addUpdateListener(new k70(this, 23));
            this.f33203m3.addListener(new pd0(this, 15));
            this.f33203m3.setInterpolator(pr.h);
            ValueAnimator valueAnimator2 = this.f33203m3;
            tw0[] tw0VarArr = this.V2;
            if (tw0VarArr == null) {
                length = 5;
            } else {
                length = tw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f33203m3.start();
            return;
        }
        if (r52 != 0) {
            f10 = 1.0f;
        }
        setCategoriesShownT(f10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof sw0) || E.getAlpha() < 0.5f) {
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
        return this.f33200j3;
    }

    public tw0 getSelectedCategory() {
        int i10;
        tw0[] tw0VarArr = this.V2;
        if (tw0VarArr != null && (i10 = this.f33200j3) >= 0 && i10 < tw0VarArr.length) {
            return tw0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean z4;
        boolean z10;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z10 = true;
            if (childAt instanceof sw0) {
                z4 = true;
            } else {
                if (childAt.getRight() > this.f33194d3) {
                    z10 = false;
                }
                z4 = false;
            }
        } else {
            z4 = false;
            z10 = false;
        }
        boolean z11 = this.f33197g3;
        if (z11 != z10) {
            this.f33197g3 = z10;
            Utilities.Callback callback2 = this.f33195e3;
            if (callback2 != null) {
                if (z10) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.c3 - this.f33194d3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z11 && (callback = this.f33195e3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.c3 - this.f33194d3))));
        }
        if (this.f33198h3 != z4) {
            this.f33198h3 = z4;
            Utilities.Callback callback3 = this.f33196f3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z4));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F1(this.f33204n3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fg.h0 h0Var = this.f33199i3;
        if (h0Var != null) {
            h0Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f33192a3 == null) {
            this.f33192a3 = new Paint(1);
        }
        this.f33192a3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.Y2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.Z2 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f33194d3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<tw0> callback) {
        this.f33201k3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f33196f3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f33195e3 = callback;
    }

    public void setShownButtonsAtStart(float f10) {
        this.U2 = f10;
    }

    public abstract boolean z1();

    public tw0[] A1(tw0[] tw0VarArr) {
        return tw0VarArr;
    }
}
