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
public abstract class ew0 extends wk0 {
    public static final cw0 f28191t3 = new CacheFetcher();
    public static final dw0 f28192u3 = new CacheFetcher();
    public float T2;
    public aw0[] U2;
    public final vv0 V2;
    public final y5 W2;
    public Drawable X2;
    public Drawable Y2;
    public Paint Z2;
    public final Paint a3;
    public int f28193b3;
    public int f28194c3;
    public Utilities.Callback f28195d3;
    public Utilities.Callback f28196e3;
    public boolean f28197f3;
    public boolean f28198g3;
    public fh.l2 f28199h3;
    public int f28200i3;
    public Utilities.Callback f28201j3;
    public float f28202k3;
    public ValueAnimator f28203l3;
    public boolean f28204m3;
    public final y5 f28205n3;
    public final y5 f28206o3;
    public final RectF f28207p3;
    public final RectF f28208q3;
    public final RectF f28209r3;
    public boolean f28210s3;

    static {
        new HashSet();
    }

    public ew0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = 6.5f;
        this.U2 = null;
        gr grVar = gr.h;
        this.W2 = new y5(this, 360L, grVar);
        Paint paint = new Paint(1);
        this.a3 = paint;
        this.f28200i3 = -1;
        this.f28202k3 = 0.0f;
        this.f28204m3 = true;
        this.f28205n3 = new y5(this, 350L, grVar);
        this.f28206o3 = new y5(this, 350L, grVar);
        this.f28207p3 = new RectF();
        this.f28208q3 = new RectF();
        this.f28209r3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        vv0 vv0Var = new vv0(this);
        this.V2 = vv0Var;
        setAdapter(vv0Var);
        f2.m0 m0Var = new f2.m0();
        setLayoutManager(m0Var);
        m0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.f6.f23092i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f34260l2));
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f34260l2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f28191t3.fetch(UserConfig.selectedAccount, Integer.valueOf(i9), new kh.e9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof zv0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f28193b3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f28202k3 = f10;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof zv0) {
                float cascade = AndroidUtilities.cascade(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((zv0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(ew0 ew0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        ew0Var.U2 = new aw0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i9 = 0; i9 < tL_messages_emojiGroups.groups.size(); i9++) {
            aw0[] aw0VarArr = ew0Var.U2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i9);
            ?? obj = new Object();
            obj.f26916c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f26914a = "premium";
            } else {
                obj.f26914a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f26915b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            aw0VarArr[i9] = obj;
        }
        ew0Var.U2 = ew0Var.B1(ew0Var.U2);
        ew0Var.V2.l();
        ew0Var.setCategoriesShownT(0.0f);
        boolean z11 = ew0Var.f28204m3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        ew0Var.G1(z11, z10);
    }

    public static void y1(ew0 ew0Var, float f10) {
        ew0Var.setCategoriesShownT(f10);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof zv0) {
            zv0 zv0Var = (zv0) view;
            f10 = e2.c.z(1.0f, zv0Var.A, 0.15f, 0.85f) * zv0Var.f35382y;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f28200i3) + ((-getScrollToStartWidth()) - Math.max(0, this.f28194c3));
        scrollBy(dp, 0);
        post(new qd((kh.f2) this, dp, 9));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, gr.h);
    }

    public void E1(int i9) {
        boolean z10;
        if (this.f28200i3 < 0 && i9 >= 0) {
            this.f28206o3.d(i9, true);
        }
        this.f28200i3 = i9;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof zv0) {
                int R = RecyclerView.R(childAt);
                zv0 zv0Var = (zv0) childAt;
                if (this.f28200i3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zv0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void F1(aw0 aw0Var) {
        int i9;
        if (this.U2 != null) {
            i9 = 0;
            while (true) {
                aw0[] aw0VarArr = this.U2;
                if (i9 >= aw0VarArr.length) {
                    break;
                } else if (aw0VarArr[i9] == aw0Var) {
                    break;
                } else {
                    i9++;
                }
            }
            E1(i9);
        }
        i9 = -1;
        E1(i9);
    }

    public final void G1(boolean z10, boolean z11) {
        int length;
        this.f28204m3 = z10;
        ?? r52 = z10;
        if (this.U2 == null) {
            r52 = 0;
        }
        if (this.f28202k3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f28203l3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28203l3 = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f28202k3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f28203l3 = ofFloat;
            ofFloat.addUpdateListener(new q60(this, 23));
            this.f28203l3.addListener(new r60(this, 22));
            this.f28203l3.setInterpolator(gr.h);
            ValueAnimator valueAnimator2 = this.f28203l3;
            aw0[] aw0VarArr = this.U2;
            if (aw0VarArr == null) {
                length = 5;
            } else {
                length = aw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f28203l3.start();
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
            if (!(E instanceof zv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ew0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f28200i3;
    }

    public aw0 getSelectedCategory() {
        int i9;
        aw0[] aw0VarArr = this.U2;
        if (aw0VarArr != null && (i9 = this.f28200i3) >= 0 && i9 < aw0VarArr.length) {
            return aw0VarArr[i9];
        }
        return null;
    }

    @Override
    public final void k0(int i9, int i10) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i11 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof zv0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f28194c3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f28197f3;
        if (z12 != z11) {
            this.f28197f3 = z11;
            Utilities.Callback callback2 = this.f28195d3;
            if (callback2 != null) {
                if (z11) {
                    i11 = Math.max(0, getScrollToStartWidth() - (this.f28193b3 - this.f28194c3));
                }
                callback2.run(Integer.valueOf(i11));
            }
            invalidate();
        } else if (z12 && (callback = this.f28195d3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f28193b3 - this.f28194c3))));
        }
        if (this.f28198g3 != z10) {
            this.f28198g3 = z10;
            Utilities.Callback callback3 = this.f28196e3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.f28204m3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fh.l2 l2Var = this.f28199h3;
        if (l2Var != null) {
            l2Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i9) {
        if (this.Z2 == null) {
            this.Z2 = new Paint(1);
        }
        this.Z2.setColor(i9);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.X2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i9, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.Y2 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i9, mode));
    }

    public void setDontOccupyWidth(int i9) {
        this.f28194c3 = i9;
    }

    public void setOnCategoryClick(Utilities.Callback<aw0> callback) {
        this.f28201j3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f28196e3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f28195d3 = callback;
    }

    public void setShownButtonsAtStart(float f10) {
        this.T2 = f10;
    }

    public aw0[] B1(aw0[] aw0VarArr) {
        return aw0VarArr;
    }
}
