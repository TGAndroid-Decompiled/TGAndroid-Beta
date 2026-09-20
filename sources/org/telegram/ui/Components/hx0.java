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
public abstract class hx0 extends vl0 {
    public static final fx0 f24771x3 = new CacheFetcher();
    public static final gx0 y3 = new CacheFetcher();
    public float X2;
    public dx0[] Y2;
    public final yw0 Z2;
    public final d6 f24772a3;
    public Drawable f24773b3;
    public Drawable f24774c3;
    public Paint f24775d3;
    public final Paint f24776e3;
    public int f24777f3;
    public int f24778g3;
    public Utilities.Callback f24779h3;
    public Utilities.Callback f24780i3;
    public boolean j3;
    public boolean f24781k3;
    public ci.eb f24782l3;
    public int f24783m3;
    public Utilities.Callback f24784n3;
    public float f24785o3;
    public ValueAnimator f24786p3;
    public boolean f24787q3;
    public final d6 f24788r3;
    public final d6 f24789s3;
    public final RectF f24790t3;
    public final RectF f24791u3;
    public final RectF f24792v3;
    public boolean f24793w3;

    static {
        new HashSet();
    }

    public hx0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        qr qrVar = qr.h;
        this.f24772a3 = new d6(this, 360L, qrVar);
        Paint paint = new Paint(1);
        this.f24776e3 = paint;
        this.f24783m3 = -1;
        this.f24785o3 = 0.0f;
        this.f24787q3 = true;
        this.f24788r3 = new d6(this, 350L, qrVar);
        this.f24789s3 = new d6(this, 350L, qrVar);
        this.f24790t3 = new RectF();
        this.f24791u3 = new RectF();
        this.f24792v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        yw0 yw0Var = new yw0(this);
        this.Z2 = yw0Var;
        setAdapter(yw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.j6.f19184i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f29207p2));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f29207p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f24771x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.s9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof cx0) {
            cx0 cx0Var = (cx0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, cx0Var.E, 0.15f, 0.85f) * cx0Var.f23422y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof cx0) {
            return Math.max(0, getHeight() * (RecyclerView.S(childAt) - 1)) + this.f24777f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f24785o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof cx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.S(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((cx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(hx0 hx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        hx0Var.Y2 = new dx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            dx0[] dx0VarArr = hx0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f23662c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f23660a = "premium";
            } else {
                obj.f23660a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f23661b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            dx0VarArr[i10] = obj;
        }
        hx0Var.Y2 = hx0Var.C1(hx0Var.Y2);
        hx0Var.Z2.l();
        hx0Var.setCategoriesShownT(0.0f);
        boolean z11 = hx0Var.f24787q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        hx0Var.H1(z11, z10);
    }

    public static void z1(hx0 hx0Var, float f7) {
        hx0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f24783m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f24778g3));
        scrollBy(dp, 0);
        post(new kd((ci.k2) this, dp, 10));
    }

    public final void E1() {
        w0(-getScrollToStartWidth(), 0, qr.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f24783m3 < 0 && i10 >= 0) {
            this.f24789s3.d(i10, true);
        }
        this.f24783m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof cx0) {
                int S = RecyclerView.S(childAt);
                cx0 cx0Var = (cx0) childAt;
                if (this.f24783m3 == S - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(dx0 dx0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                dx0[] dx0VarArr = this.Y2;
                if (i10 >= dx0VarArr.length) {
                    break;
                } else if (dx0VarArr[i10] == dx0Var) {
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
        this.f24787q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f24785o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f24786p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24786p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f24785o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24786p3 = ofFloat;
            ofFloat.addUpdateListener(new p70(this, 23));
            this.f24786p3.addListener(new dd0(this, 17));
            this.f24786p3.setInterpolator(qr.h);
            ValueAnimator valueAnimator2 = this.f24786p3;
            dx0[] dx0VarArr = this.Y2;
            if (dx0VarArr == null) {
                length = 5;
            } else {
                length = dx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f24786p3.start();
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
            if (!(F instanceof cx0) || F.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f24783m3;
    }

    public dx0 getSelectedCategory() {
        int i10;
        dx0[] dx0VarArr = this.Y2;
        if (dx0VarArr != null && (i10 = this.f24783m3) >= 0 && i10 < dx0VarArr.length) {
            return dx0VarArr[i10];
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
            if (childAt instanceof cx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f24778g3) {
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
            Utilities.Callback callback2 = this.f24779h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f24777f3 - this.f24778g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f24779h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f24777f3 - this.f24778g3))));
        }
        if (this.f24781k3 != z10) {
            this.f24781k3 = z10;
            Utilities.Callback callback3 = this.f24780i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f24787q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.eb ebVar = this.f24782l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f24775d3 == null) {
            this.f24775d3 = new Paint(1);
        }
        this.f24775d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f24773b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f24774c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f24778g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<dx0> callback) {
        this.f24784n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f24780i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f24779h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public dx0[] C1(dx0[] dx0VarArr) {
        return dx0VarArr;
    }
}
