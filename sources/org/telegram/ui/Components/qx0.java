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
public abstract class qx0 extends im0 {
    public static final ox0 f29734v3 = new CacheFetcher();
    public static final px0 f29735w3 = new CacheFetcher();
    public float V2;
    public mx0[] W2;
    public final hx0 X2;
    public final f6 Y2;
    public Drawable Z2;
    public Drawable f29736a3;
    public Paint f29737b3;
    public final Paint f29738c3;
    public int f29739d3;
    public int f29740e3;
    public Utilities.Callback f29741f3;
    public Utilities.Callback f29742g3;
    public boolean f29743h3;
    public boolean f29744i3;
    public ai.ic f29745j3;
    public int f29746k3;
    public Utilities.Callback f29747l3;
    public float f29748m3;
    public ValueAnimator f29749n3;
    public boolean f29750o3;
    public final f6 f29751p3;
    public final f6 f29752q3;
    public final RectF f29753r3;
    public final RectF f29754s3;
    public final RectF f29755t3;
    public boolean f29756u3;

    static {
        new HashSet();
    }

    public qx0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = 6.5f;
        this.W2 = null;
        bs bsVar = bs.h;
        this.Y2 = new f6(this, 360L, bsVar);
        Paint paint = new Paint(1);
        this.f29738c3 = paint;
        this.f29746k3 = -1;
        this.f29748m3 = 0.0f;
        this.f29750o3 = true;
        this.f29751p3 = new f6(this, 350L, bsVar);
        this.f29752q3 = new f6(this, 350L, bsVar);
        this.f29753r3 = new RectF();
        this.f29754s3 = new RectF();
        this.f29755t3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        hx0 hx0Var = new hx0(this);
        this.X2 = hx0Var;
        setAdapter(hx0Var);
        s4.b0 b0Var = new s4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.h6.f21078i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(i11, this.f27301n2));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i11, this.f27301n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f29734v3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ei.c9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof lx0) {
            lx0 lx0Var = (lx0) view;
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, lx0Var.E, 0.15f, 0.85f) * lx0Var.f28332y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof lx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f29739d3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f29748m3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof lx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((lx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(qx0 qx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        qx0Var.W2 = new mx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            mx0[] mx0VarArr = qx0Var.W2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f28622c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f28620a = "premium";
            } else {
                obj.f28620a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f28621b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            mx0VarArr[i10] = obj;
        }
        qx0Var.W2 = qx0Var.C1(qx0Var.W2);
        qx0Var.X2.l();
        qx0Var.setCategoriesShownT(0.0f);
        boolean z11 = qx0Var.f29750o3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        qx0Var.H1(z11, z10);
    }

    public static void z1(qx0 qx0Var, float f7) {
        qx0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f29746k3) + ((-getScrollToStartWidth()) - Math.max(0, this.f29740e3));
        scrollBy(dp, 0);
        post(new e2((ei.g2) this, dp, 12));
    }

    public final void E1() {
        v0(-getScrollToStartWidth(), 0, bs.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f29746k3 < 0 && i10 >= 0) {
            this.f29752q3.d(i10, true);
        }
        this.f29746k3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof lx0) {
                int R = RecyclerView.R(childAt);
                lx0 lx0Var = (lx0) childAt;
                if (this.f29746k3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(mx0 mx0Var) {
        int i10;
        if (this.W2 != null) {
            i10 = 0;
            while (true) {
                mx0[] mx0VarArr = this.W2;
                if (i10 >= mx0VarArr.length) {
                    break;
                } else if (mx0VarArr[i10] == mx0Var) {
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
        this.f29750o3 = z10;
        ?? r52 = z10;
        if (this.W2 == null) {
            r52 = 0;
        }
        if (this.f29748m3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f29749n3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f29749n3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f29748m3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29749n3 = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 24));
            this.f29749n3.addListener(new c80(this, 22));
            this.f29749n3.setInterpolator(bs.h);
            ValueAnimator valueAnimator2 = this.f29749n3;
            mx0[] mx0VarArr = this.W2;
            if (mx0VarArr == null) {
                length = 5;
            } else {
                length = mx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f29749n3.start();
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
            if (!(E instanceof lx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f29746k3;
    }

    public mx0 getSelectedCategory() {
        int i10;
        mx0[] mx0VarArr = this.W2;
        if (mx0VarArr != null && (i10 = this.f29746k3) >= 0 && i10 < mx0VarArr.length) {
            return mx0VarArr[i10];
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
            if (childAt instanceof lx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f29740e3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f29743h3;
        if (z12 != z11) {
            this.f29743h3 = z11;
            Utilities.Callback callback2 = this.f29741f3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f29739d3 - this.f29740e3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f29741f3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f29739d3 - this.f29740e3))));
        }
        if (this.f29744i3 != z10) {
            this.f29744i3 = z10;
            Utilities.Callback callback3 = this.f29742g3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f29750o3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai.ic icVar = this.f29745j3;
        if (icVar != null) {
            icVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f29737b3 == null) {
            this.f29737b3 = new Paint(1);
        }
        this.f29737b3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.Z2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f29736a3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f29740e3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<mx0> callback) {
        this.f29747l3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f29742g3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f29741f3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.V2 = f7;
    }

    public mx0[] C1(mx0[] mx0VarArr) {
        return mx0VarArr;
    }
}
