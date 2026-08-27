package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
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
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public abstract class gw0 extends zk0 {

    public static final ew0 f28835t3 = new ew0();

    public static final fw0 f28836u3 = new fw0();
    public float T2;
    public cw0[] U2;
    public final xv0 V2;
    public final y5 W2;
    public Drawable X2;
    public Drawable Y2;
    public Paint Z2;
    public final Paint a3;

    public int f28837b3;

    public int f28838c3;

    public Utilities.Callback f28839d3;

    public Utilities.Callback f28840e3;

    public boolean f28841f3;

    public boolean f28842g3;

    public ag.s0 f28843h3;

    public int f28844i3;

    public Utilities.Callback f28845j3;

    public float f28846k3;

    public ValueAnimator f28847l3;

    public boolean f28848m3;

    public final y5 f28849n3;

    public final y5 f28850o3;

    public final RectF f28851p3;

    public final RectF f28852q3;

    public final RectF f28853r3;

    public boolean f28854s3;

    static {
        new HashSet();
    }

    public gw0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = 6.5f;
        this.U2 = null;
        er erVar = er.h;
        this.W2 = new y5(this, 360L, erVar);
        Paint paint = new Paint(1);
        this.a3 = paint;
        this.f28844i3 = -1;
        this.f28846k3 = 0.0f;
        this.f28848m3 = true;
        this.f28849n3 = new y5(this, 350L, erVar);
        this.f28850o3 = new y5(this, 350L, erVar);
        this.f28851p3 = new RectF();
        this.f28852q3 = new RectF();
        this.f28853r3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        xv0 xv0Var = new xv0(this);
        this.V2 = xv0Var;
        setAdapter(xv0Var);
        f2.k0 k0Var = new f2.k0();
        setLayoutManager(k0Var);
        k0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.g6.f23144i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f35277l2));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f35277l2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long jCurrentTimeMillis = System.currentTimeMillis();
        f28835t3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new lh.b9(this, jCurrentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof bw0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f28837b3 + (-childAt.getLeft());
    }

    public void setCategoriesShownT(float f10) {
        this.f28846k3 = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof bw0) {
                float fCascade = AndroidUtilities.cascade(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (fCascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((bw0) childAt).j();
                }
                childAt.setAlpha(fCascade);
                childAt.setScaleX(fCascade);
                childAt.setScaleY(fCascade);
            }
        }
        invalidate();
    }

    public static void x1(gw0 gw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        gw0Var.U2 = new cw0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            cw0[] cw0VarArr = gw0Var.U2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            cw0 cw0Var = new cw0();
            cw0Var.f27561c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                cw0Var.f27559a = "premium";
            } else {
                cw0Var.f27559a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            cw0Var.f27560b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            cw0Var.d = emojiGroup.title;
            cw0VarArr[i10] = cw0Var;
        }
        gw0Var.U2 = gw0Var.B1(gw0Var.U2);
        gw0Var.V2.l();
        gw0Var.setCategoriesShownT(0.0f);
        gw0Var.G1(gw0Var.f28848m3, System.currentTimeMillis() - j10 > 16);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float fZ = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof bw0) {
            bw0 bw0Var = (bw0) view;
            fZ = com.google.android.recaptcha.internal.a.z(1.0f, bw0Var.A, 0.15f, 0.85f) * bw0Var.f27220y;
        }
        float f10 = width * fZ;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public abstract boolean A1();

    public final void C1() {
        int iDp = (AndroidUtilities.dp(34.0f) * this.f28844i3) + ((-getScrollToStartWidth()) - Math.max(0, this.f28838c3));
        scrollBy(iDp, 0);
        post(new xl((lh.d2) this, iDp, 8));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, er.h);
    }

    public void E1(int i10) {
        if (this.f28844i3 < 0 && i10 >= 0) {
            this.f28850o3.d(i10, true);
        }
        this.f28844i3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof bw0) {
                ((bw0) childAt).l(this.f28844i3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void F1(cw0 cw0Var) {
        int i10;
        if (this.U2 != null) {
            i10 = 0;
            while (true) {
                cw0[] cw0VarArr = this.U2;
                if (i10 >= cw0VarArr.length) {
                    break;
                } else if (cw0VarArr[i10] != cw0Var) {
                    i10++;
                }
            }
            i10 = -1;
        } else {
            i10 = -1;
        }
        E1(i10);
    }

    public final void G1(boolean z10, boolean z11) {
        this.f28848m3 = z10;
        ?? r10 = z10;
        if (this.U2 == null) {
            r10 = 0;
        }
        if (this.f28846k3 == ((float) r10)) {
            return;
        }
        ValueAnimator valueAnimator = this.f28847l3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28847l3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r10 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f28846k3, r10 != 0 ? 1.0f : 0.0f);
        this.f28847l3 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(this, 23));
        this.f28847l3.addListener(new sz(this, 24));
        this.f28847l3.setInterpolator(er.h);
        ValueAnimator valueAnimator2 = this.f28847l3;
        cw0[] cw0VarArr = this.U2;
        valueAnimator2.setDuration(((long) (cw0VarArr == null ? 5 : cw0VarArr.length)) * 120);
        this.f28847l3.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View viewE = E(motionEvent.getX(), motionEvent.getY());
            if (!(viewE instanceof bw0) || viewE.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        if (this.Z2 != null) {
            int iMin = Integer.MAX_VALUE;
            int iMax = Integer.MIN_VALUE;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof bw0) {
                    iMin = Math.min(iMin, childAt.getLeft());
                    iMax = Math.max(iMax, childAt.getRight());
                }
            }
            if (iMin < iMax) {
                int iZ = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.f28846k3, AndroidUtilities.dp(32.0f) + getWidth(), iMin);
                int iZ2 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.f28846k3, AndroidUtilities.dp(32.0f) + getWidth(), iMax);
                canvas2 = canvas;
                canvas2.drawRect(iZ, 0.0f, iZ2, getHeight(), this.Z2);
                if (iZ2 < getWidth() && (drawable = this.X2) != null) {
                    drawable.setAlpha(255);
                    Drawable drawable2 = this.X2;
                    drawable2.setBounds(iZ2, 0, drawable2.getIntrinsicWidth() + iZ2, getHeight());
                    this.X2.draw(canvas2);
                }
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        float fD = this.f28849n3.d(this.f28844i3 >= 0 ? 1.0f : 0.0f, false);
        int i11 = this.f28844i3;
        y5 y5Var = this.f28850o3;
        float fD2 = i11 >= 0 ? y5Var.d(i11, false) : y5Var.f34812c;
        if (fD > 0.0f) {
            float f10 = fD2 + 1.0f;
            double d = f10;
            int iMax2 = Math.max(1, (int) Math.floor(d));
            int iMax3 = Math.max(1, (int) Math.ceil(d));
            View view = null;
            View view2 = null;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt2 = getChildAt(i12);
                int iR = RecyclerView.R(childAt2);
                if (iR == iMax2) {
                    view = childAt2;
                }
                if (iR == iMax3) {
                    view2 = childAt2;
                }
                if (view != null && view2 != null) {
                    break;
                }
            }
            Paint paint = this.a3;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * fD));
            if (view != null && view2 != null) {
                float f11 = iMax2 == iMax3 ? 0.5f : (f10 - iMax2) / (iMax3 - iMax2);
                RectF rectF = this.f28851p3;
                z1(rectF, view);
                RectF rectF2 = this.f28852q3;
                z1(rectF2, view2);
                RectF rectF3 = this.f28853r3;
                AndroidUtilities.lerp(rectF, rectF2, f11, rectF3);
                canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            }
            paint.setAlpha(alpha);
        }
        super.draw(canvas2);
        Drawable drawable3 = this.X2;
        if (drawable3 != null) {
            drawable3.setAlpha((int) (this.W2.d((canScrollHorizontally(-1) && this.f28842g3) ? 1.0f : 0.0f, false) * 255.0f * this.f28846k3));
            if (this.X2.getAlpha() > 0) {
                Drawable drawable4 = this.X2;
                drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                this.X2.draw(canvas2);
            }
        }
    }

    public int getCategoryIndex() {
        return this.f28844i3;
    }

    public cw0 getSelectedCategory() {
        int i10;
        cw0[] cw0VarArr = this.U2;
        if (cw0VarArr == null || (i10 = this.f28844i3) < 0 || i10 >= cw0VarArr.length) {
            return null;
        }
        return cw0VarArr[i10];
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof bw0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.f28838c3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f28841f3;
        if (z12 != z11) {
            this.f28841f3 = z11;
            Utilities.Callback callback2 = this.f28839d3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.f28837b3 - this.f28838c3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.f28839d3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f28837b3 - this.f28838c3))));
        }
        if (this.f28842g3 != z10) {
            this.f28842g3 = z10;
            Utilities.Callback callback3 = this.f28840e3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.f28848m3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ag.s0 s0Var = this.f28843h3;
        if (s0Var != null) {
            s0Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.Z2 == null) {
            this.Z2 = new Paint(1);
        }
        this.Z2.setColor(i10);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.X2 = drawableMutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.Y2 = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f28838c3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<cw0> callback) {
        this.f28845j3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f28840e3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f28839d3 = callback;
    }

    public void setShownButtonsAtStart(float f10) {
        this.T2 = f10;
    }

    public cw0[] B1(cw0[] cw0VarArr) {
        return cw0VarArr;
    }
}
