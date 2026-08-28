package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class uj0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.c1 f33041g1 = new org.telegram.ui.Cells.c1(Float.class, "transitionProgress", 2);
    public final float A;
    public boolean A0;
    public final float B;
    public boolean B0;
    public int C;
    public boolean C0;
    public MessageObject D;
    public final Paint D0;
    public boolean E;
    public final Paint E0;
    public int F;
    public io F0;
    public long G;
    public boolean G0;
    public boolean H;
    public final AnimationNotificationsLocker H0;
    public boolean I;
    public final int I0;
    public boolean J;
    public boolean J0;
    public float K;
    public boolean K0;
    public long L;
    public Runnable L0;
    public ValueAnimator M;
    public boolean M0;
    public FrameLayout N;
    public l80 N0;
    public fh.v O;
    public int O0;
    public final ArrayList P;
    public int P0;
    public final ArrayList Q;
    public float Q0;
    public final ArrayList R;
    public float R0;
    public final of.g0 S;
    public kg.d S0;
    public final kj0 T;
    public kg.d T0;
    public final RectF U;
    public kg.d U0;
    public boolean V;
    public ig.a V0;
    public final HashSet W;
    public lg.d W0;
    public boolean X0;
    public boolean Y0;
    public io Z0;
    public boolean f33042a;
    public final HashSet f33043a0;
    public boolean f33044a1;
    public final gh.f1 f33045b;
    public final int[] f33046b0;
    public boolean f33047b1;
    public final float f33048c;
    public tj0 f33049c0;
    public boolean f33050c1;
    public final ArrayList d;
    public final Rect f33051d0;
    public Paint f33052d1;
    public final ArrayList f33053e;
    public final Drawable f33054e0;
    public Matrix f33055e1;
    public final Paint f33056f;
    public final boolean f33057f0;
    public LinearGradient f33058f1;
    public final org.telegram.ui.ActionBar.b6 f33059g0;
    public final Paint h;
    public hg.r0 f33060h0;
    public int f33061i0;
    public float f33062j0;
    public float f33063k0;
    public float f33064l0;
    public float m0;
    public final Paint f33065n;
    public boolean f33066n0;
    public long f33067o0;
    public org.telegram.ui.ActionBar.o2 f33068p0;
    public zf.b1 f33069q0;
    public float f33070r;
    public ir f33071r0;
    public float f33072s;
    public float f33073s0;
    public hg.e0 f33074t0;
    public ValueAnimator f33075u0;
    public float v;
    public final sj0 f33076v0;
    public final RectF f33077w;
    public boolean f33078w0;
    public final Path f33079x;
    public float f33080x0;
    public float f33081y;
    public final HashSet f33082y0;
    public final HashSet f33083z0;

    public uj0(int i9, int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f33042a = false;
        this.d = new ArrayList();
        this.f33053e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f33056f = paint;
        this.h = new Paint(1);
        this.f33065n = new Paint(1);
        this.v = 1.0f;
        this.f33077w = new RectF();
        this.f33079x = new Path();
        this.f33081y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.A = dp;
        this.B = dp / 2.0f;
        this.C = AndroidUtilities.dp(36.0f);
        this.P = new ArrayList(20);
        this.Q = new ArrayList(10);
        this.R = new ArrayList(20);
        this.U = new RectF();
        this.V = false;
        this.W = new HashSet();
        this.f33043a0 = new HashSet();
        this.f33046b0 = new int[2];
        Rect rect = new Rect();
        this.f33051d0 = rect;
        new ArrayList();
        this.f33082y0 = new HashSet();
        this.f33083z0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.D0 = paint2;
        Paint paint3 = new Paint(1);
        this.E0 = paint3;
        this.H0 = new AnimationNotificationsLocker();
        this.K0 = true;
        this.f33047b1 = false;
        this.I0 = i9;
        this.f33048c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var));
        paint3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Jj, b6Var));
        this.f33059g0 = b6Var;
        this.F = i10;
        this.f33068p0 = o2Var;
        sj0 sj0Var = new sj0(this, context);
        this.f33076v0 = sj0Var;
        sj0Var.setVisibility(8);
        sj0Var.K = false;
        sj0Var.f32476c.setVisibility(8);
        addView(sj0Var);
        this.f33057f0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f33054e0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Td, false), PorterDuff.Mode.MULTIPLY));
        gh.f1 f1Var = new gh.f1(this, context, 18);
        this.f33045b = f1Var;
        f1Var.setClipChildren(false);
        f1Var.setClipToPadding(false);
        of.g0 g0Var = new of.g0((ViewGroup) this, 4);
        this.S = g0Var;
        f1Var.i(new hj0(this, 0));
        f1Var.setLayoutManager(g0Var);
        f1Var.setOverScrollMode(2);
        kj0 kj0Var = new kj0(this);
        this.T = kj0Var;
        f1Var.setAdapter(kj0Var);
        f1Var.j(new oj0(this));
        f1Var.j(new kn(this, 8));
        f1Var.i(new hj0(this, 1));
        f1Var.setOnItemClickListener(new j(this, 11));
        f1Var.setOnItemLongClickListener((ok0) new bg.x2(this, i9, 7));
        addView(f1Var, g7.e6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (f1Var.getLayoutParams().height - f1Var.getPaddingTop()) - f1Var.getPaddingBottom();
        sj0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        sj0Var.getLayoutParams().height = paddingTop;
        if (i9 != 2 && i9 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i10).preloadDefaultReactions();
    }

    public static void a(uj0 uj0Var) {
        if (uj0Var.f33074t0 != null) {
            return;
        }
        hg.e0 e0Var = new hg.e0(uj0Var.I0, uj0Var.f33068p0, uj0Var.R, uj0Var.W, uj0Var, uj0Var.f33059g0, uj0Var.f33042a);
        uj0Var.f33074t0 = e0Var;
        ig.a aVar = uj0Var.V0;
        boolean z10 = true;
        if (aVar != null) {
            lg.d dVar = uj0Var.W0;
            org.telegram.ui.s41 s41Var = e0Var.f10584m.f36664b0;
            s41Var.f41691x = true;
            s41Var.setBackground(null);
            s41Var.d();
            s41Var.invalidate();
            kg.d c10 = aVar.c(e0Var.f10574a, null, true);
            c10.n(dVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            e0Var.f10596z = c10;
        }
        hg.e0 e0Var2 = uj0Var.f33074t0;
        tj0 tj0Var = uj0Var.f33049c0;
        if (tj0Var != null && !tj0Var.n()) {
            z10 = false;
        }
        e0Var2.f10584m.setLongPressEnabled(z10);
        uj0Var.j();
        uj0Var.f33074t0.f10587p = new ib0(uj0Var, 16);
        uj0Var.m();
    }

    public static void b(uj0 uj0Var, View view, float f10) {
        if (view instanceof sj0) {
            ((sj0) view).h = f10;
            return;
        }
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        boolean z10 = true;
        while (i9 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < messageObject.messageOwner.reactions.results.size(); i10++) {
                    if (messageObject.messageOwner.reactions.results.get(i10).chosen) {
                        hg.r0 d = hg.r0.d(messageObject.messageOwner.reactions.results.get(i10).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i11 = 0;
            while (i11 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i11)))) {
                    longSparseArray.removeAt(i11);
                    i11--;
                }
                i11++;
            }
            i9++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((hg.r0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    public final void d() {
        hg.e0 e0Var = this.f33074t0;
        if (e0Var != null) {
            if (!e0Var.f10588q) {
                e0Var.f10588q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hg.x(e0Var, 0));
                ofFloat.addListener(new hg.c0(e0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f33074t0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.G && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.D, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            if (this.I0 == 4) {
                invalidate();
                gh.f1 f1Var = this.f33045b;
                f1Var.invalidate();
                f1Var.f1();
                for (int i11 = 0; i11 < f1Var.getChildCount(); i11++) {
                    View childAt = f1Var.getChildAt(i11);
                    if (childAt instanceof sj0) {
                        sj0 sj0Var = (sj0) childAt;
                        sj0Var.f32474a.invalidate();
                        sj0Var.f32475b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i9 == NotificationCenter.availableEffectsUpdate) {
            p(this.D, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        hg.e0 e0Var = this.f33074t0;
        if (e0Var != null) {
            e0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i9, Canvas canvas) {
        int i10;
        float height;
        float f13;
        float f14;
        float height2;
        if (this.I0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.H;
        RectF rectF = this.f33077w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), gr.f28844f.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            gr grVar = gr.f28844f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f15, 0.0f, grVar.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), grVar.getInterpolation(this.K)));
        }
        if (!LocaleController.isRTL && !this.I) {
            i10 = getWidth() - this.C;
        } else {
            i10 = this.C;
        }
        float f16 = i10 + this.Q0;
        if (this.H) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f33054e0;
        drawable.setAlpha(i9);
        Paint paint = this.f33056f;
        paint.setAlpha(i9);
        float f17 = f16 - f10;
        float f18 = dp;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean u10 = this.f33049c0.u();
        float f23 = height;
        RectF rectF2 = this.U;
        if (u10) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f33049c0.s(canvas, rectF2, f13, getX(), getY(), i9, false);
        } else {
            f13 = f10;
            if (this.T0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f17, f20, f21, f22);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.T0.setBounds(rect);
                this.T0.setAlpha(paint.getAlpha());
                this.T0.draw(canvas);
            } else {
                canvas.drawCircle(f16, f23, f13, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f24 = this.A;
        if (!z11 && !this.I) {
            f14 = (getWidth() - this.C) + f24;
        } else {
            f14 = this.C - f24;
        }
        float f25 = this.Q0 + this.R0 + f14;
        boolean z12 = this.H;
        float f26 = this.B;
        if (z12) {
            height2 = (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f);
        } else {
            height2 = ((getHeight() - f26) - f18) + g();
        }
        float lerp = AndroidUtilities.lerp(height2, (f26 + f18) - g(), gr.f28844f.getInterpolation(this.K));
        float f27 = (-AndroidUtilities.dp(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((lerp - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + lerp + f27));
        drawable.draw(canvas);
        if (this.f33049c0.u()) {
            rectF2.set(f25 - f12, lerp - f12, f25 + f12, lerp + f12);
            this.f33049c0.s(canvas, rectF2, f12, getX(), getY(), i9, false);
        } else if (this.U0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(f25 - f12, lerp - f12, f25 + f12, lerp + f12);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.U0.setBounds(rect2);
            this.U0.setAlpha(paint.getAlpha());
            this.U0.draw(canvas);
        } else {
            canvas.drawCircle(f25, lerp, f12, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public tj0 getDelegate() {
        return this.f33049c0;
    }

    public int getHintTextWidth() {
        return this.O0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.P.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.f33080x0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public hg.e0 getReactionsWindow() {
        return this.f33074t0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f10;
        HashSet hashSet = this.W;
        if (hashSet.isEmpty()) {
            return "";
        }
        hg.r0 r0Var = (hg.r0) hashSet.iterator().next();
        long j10 = r0Var.f10718g;
        String str = null;
        if (j10 != 0 && (f10 = k5.f(this.F, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = r0Var.f10717f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<hg.r0> getSelectedReactions() {
        return this.W;
    }

    public float getTopOffset() {
        if (this.M0) {
            return ((FrameLayout.LayoutParams) this.f33045b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return AndroidUtilities.dp(16.0f) + e2.c.e(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public List<hg.r0> getVisibleReactionsList() {
        return this.P;
    }

    public int getWindowType() {
        int i9 = this.I0;
        if (i9 == 4) {
            return 13;
        }
        if (i9 == 3) {
            return 11;
        }
        if (i9 == 5) {
            return 14;
        }
        if (this.B0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        hg.e0 e0Var = this.f33074t0;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f10576c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i9 = 0;
        int i10 = this.I0;
        if (i10 == 4) {
            Iterator it = this.W.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                hg.r0 r0Var = (hg.r0) it.next();
                if (!hashSet.contains(r0Var)) {
                    hashSet.add(r0Var);
                    arrayList.add(r0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i9 < enabledReactionsList.size()) {
                hg.r0 c10 = hg.r0.c(enabledReactionsList.get(i9));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
                i9++;
            }
        } else if (this.A0 && i10 != 4) {
            if (i10 == 5) {
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.F).getAvailableEffects();
                if (availableEffects != null) {
                    while (i9 < availableEffects.effects.size()) {
                        hg.r0 e10 = hg.r0.e(availableEffects.effects.get(i9));
                        if (!hashSet.contains(e10)) {
                            hashSet.add(e10);
                            arrayList.add(e10);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (i10 == 3) {
                topReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            } else {
                topReactions = MediaDataController.getInstance(this.F).getTopReactions();
            }
            if (i10 == 3) {
                TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.F).getSavedReactionTags(0L);
                if (savedReactionTags != null) {
                    for (int i12 = 0; i12 < savedReactionTags.tags.size(); i12++) {
                        hg.r0 d = hg.r0.d(savedReactionTags.tags.get(i12).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i13 = 0; i13 < topReactions.size(); i13++) {
                    hg.r0 d9 = hg.r0.d(topReactions.get(i13));
                    if (!hashSet.contains(d9)) {
                        hashSet.add(d9);
                        arrayList.add(d9);
                    }
                }
            } else {
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    hg.r0 d10 = hg.r0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10) && (i10 == 3 || UserConfig.getInstance(this.F).isPremium() || d10.f10718g == 0)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            if (i10 != 3 || UserConfig.getInstance(this.F).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.F).getRecentReactions();
                for (int i15 = 0; i15 < recentReactions.size(); i15++) {
                    hg.r0 d11 = hg.r0.d(recentReactions.get(i15));
                    if (!hashSet.contains(d11)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
                while (i9 < enabledReactionsList2.size()) {
                    hg.r0 c11 = hg.r0.c(enabledReactionsList2.get(i9));
                    if (!hashSet.contains(c11)) {
                        hashSet.add(c11);
                        arrayList.add(c11);
                    }
                    i9++;
                }
            }
        } else if (i10 == 3) {
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            int i16 = 0;
            while (i9 < savedReactions.size()) {
                hg.r0 d12 = hg.r0.d(savedReactions.get(i9));
                if (!hashSet.contains(d12)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                    i16++;
                }
                if (i16 != 16) {
                    i9++;
                } else {
                    return;
                }
            }
        } else {
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i9 < enabledReactionsList3.size()) {
                arrayList.add(hg.r0.c(enabledReactionsList3.get(i9)));
                i9++;
            }
        }
    }

    public void j() {
        int i9 = 0;
        while (true) {
            gh.f1 f1Var = this.f33045b;
            if (i9 < f1Var.getChildCount()) {
                View childAt = f1Var.getChildAt(i9);
                if (childAt instanceof sj0) {
                    ((sj0) childAt).f32475b.invalidate();
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.f33065n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, hg.r0 r0Var, boolean z10) {
        tj0 tj0Var = this.f33049c0;
        if (tj0Var != null) {
            tj0Var.d(view, r0Var, z10, true);
        }
        if (this.I0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.K0 = true;
        this.f33061i0 = 0;
        this.f33062j0 = 0.0f;
        this.f33080x0 = 0.0f;
        this.f33060h0 = null;
        this.f33066n0 = false;
        gj0 gj0Var = new gj0(this, 1);
        gh.f1 f1Var = this.f33045b;
        AndroidUtilities.forEachViews((RecyclerView) f1Var, (d5.d) gj0Var);
        this.f33082y0.clear();
        f1Var.invalidate();
        fh.v vVar = this.O;
        if (vVar != null) {
            vVar.invalidate();
        }
        invalidate();
    }

    public final void o(ig.a aVar, lg.d dVar) {
        this.V0 = aVar;
        this.W0 = dVar;
        kg.d c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.S0 = c10;
        kg.d c11 = aVar.c(this, null, true);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(8.0f));
        c11.o(AndroidUtilities.dp(8.0f));
        this.T0 = c11;
        kg.d c12 = aVar.c(this, null, true);
        c12.n(dVar);
        c12.p(AndroidUtilities.dp(4.0f));
        c12.o(AndroidUtilities.dp(8.0f));
        this.U0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z10) {
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i10;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.D = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i9 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i11);
                i11++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i9++;
                }
            }
        } else {
            i9 = 0;
        }
        int i12 = this.I0;
        if (i12 == 0 && this.D != null && i9 >= MessagesController.getInstance(this.F).getChatMaxUniqReactions(this.D.getDialogId())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        if (i12 == 0 && this.D != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.F).getChat(Long.valueOf(-this.D.getDialogId())))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f33078w0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.F).getChatFull(-messageObject.getFromChatId())) == null) {
            this.G = -messageObject.getFromChatId();
            MessagesController.getInstance(this.F).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.V = false;
        if (i12 == 3) {
            this.A0 = UserConfig.getInstance(this.F).isPremium();
            h(arrayList2);
        } else if (i12 == 5) {
            this.A0 = true;
            h(arrayList2);
        } else if (this.E) {
            this.A0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.V = true;
                ?? obj = new Object();
                obj.f10713a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.D.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(hg.r0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.V = true;
                ?? obj2 = new Object();
                obj2.f10713a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.F).getChat(Long.valueOf(chatFull.f22381id));
                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.A0 = true;
                } else {
                    this.A0 = false;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i14);
                    i14++;
                    TLRPC.Reaction reaction2 = reaction;
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.F).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(hg.r0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(hg.r0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.A0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i15))) {
                i15--;
                arrayList2.remove(i15);
            } else {
                hashSet.add((hg.r0) arrayList2.get(i15));
            }
            i15++;
        }
        if (!this.E && ((!this.A0 && arrayList2.size() > 16) || (this.A0 && !UserConfig.getInstance(this.F).isPremium() && MessagesController.getInstance(this.F).premiumFeaturesBlocked()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.B0 = z13;
        if (i12 == 3 && !UserConfig.getInstance(this.F).isPremium()) {
            this.B0 = false;
        }
        if (i12 == 4) {
            this.B0 = true;
        }
        ArrayList arrayList5 = this.P;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            if (dp < 1) {
                dp = 1;
            }
            int i16 = 0;
            while (i16 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((hg.r0) arrayList2.get(i16));
                i16++;
            }
            if (i16 < arrayList2.size()) {
                sj0.a(this.f33076v0, (hg.r0) arrayList2.get(i16), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.C0 = true;
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (((hg.r0) arrayList5.get(i17)).f10718g != 0) {
                this.C0 = false;
            }
        }
        ArrayList arrayList6 = this.R;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        kj0 kj0Var = this.T;
        uj0 uj0Var = kj0Var.d;
        ArrayList arrayList7 = uj0Var.f33053e;
        ArrayList arrayList8 = uj0Var.P;
        ArrayList arrayList9 = uj0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i18 = 0; i18 < arrayList8.size(); i18++) {
            hg.r0 r0Var = (hg.r0) arrayList8.get(i18);
            if (r0Var.f10717f == null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            arrayList9.add(new lj0(i10, r0Var));
        }
        if (!uj0Var.Q.isEmpty() && !MessagesController.getInstance(uj0Var.F).premiumFeaturesBlocked()) {
            arrayList9.add(new lj0(1, null));
        }
        if (uj0Var.q()) {
            arrayList9.add(new lj0(2, null));
        }
        if (z10) {
            kj0Var.E(arrayList7, arrayList9);
        } else {
            kj0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
                if (messageObject.messageOwner.reactions.results.get(i19).chosen) {
                    this.W.add(hg.r0.d(messageObject.messageOwner.reactions.results.get(i19).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.A0 && !this.B0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.G0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.H0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.c1 c1Var = f33041g1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new kh.l5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.f33082y0.clear();
            int i9 = 0;
            while (true) {
                gh.f1 f1Var = this.f33045b;
                if (i9 >= f1Var.getChildCount()) {
                    break;
                }
                if (f1Var.getChildAt(i9) instanceof sj0) {
                    ((sj0) f1Var.getChildAt(i9)).d();
                }
                i9++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.Q0 = f10;
    }

    public void setChatScrimView(io ioVar) {
        this.Z0 = ioVar;
    }

    public void setCurrentAccount(int i9) {
        this.F = i9;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f33073s0 = f10;
        io ioVar = this.Z0;
        if (ioVar != null) {
            ioVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.f33071r0.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 40)));
        } else {
            this.f33071r0.setBackground(null);
        }
    }

    public void setDelegate(tj0 tj0Var) {
        this.f33049c0 = tj0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.f33068p0 = o2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.M0 = true;
        if (this.N0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.b6 b6Var = this.f33059g0;
            l80 l80Var = new l80(context, b6Var);
            this.N0 = l80Var;
            l80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.N0.setClickable(true);
            this.N0.setTextSize(1, 12.0f);
            int i9 = this.I0;
            if (i9 != 1 && i9 != 2 && i9 != 4) {
                this.N0.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
            } else {
                this.N0.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
                this.N0.setAlpha(0.5f);
            }
            this.N0.setGravity(1);
            addView(this.N0, g7.e6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.N0.setText(charSequence);
        this.f33044a1 = false;
        ((FrameLayout.LayoutParams) this.f33076v0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f33045b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.R0 = f10;
    }

    public void setMirrorX(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.L0 = runnable;
    }

    public void setParentLayout(io ioVar) {
        this.F0 = ioVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            String str = arrayList.get(i9);
            i9++;
            hg.r0 b10 = hg.r0.b(str);
            hashSet.add(b10);
            this.f33043a0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f33045b, (d5.d) new gj0(this, 0));
    }

    public void setSelectedReaction(hg.r0 r0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (r0Var != null) {
            hashSet.add(r0Var);
        }
        this.T.l();
    }

    public void setSelectedReactionAnimated(hg.r0 r0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (r0Var != null) {
            hashSet.add(r0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f33045b, (d5.d) new gj0(this, 0));
    }

    public void setSelectedReactionInclusive(hg.r0 r0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (r0Var != null) {
            hashSet.add(r0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f33045b, (d5.d) new gj0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.W;
        hashSet.clear();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            MessageObject messageObject = arrayList.get(i9);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < messageObject.messageOwner.reactions.results.size(); i10++) {
                    if (messageObject.messageOwner.reactions.results.get(i10).chosen) {
                        hashSet.add(hg.r0.d(messageObject.messageOwner.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.T.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f33045b, (d5.d) new gj0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            if (!z10) {
                int i9 = 0;
                while (true) {
                    gh.f1 f1Var = this.f33045b;
                    if (i9 >= f1Var.getChildCount()) {
                        break;
                    }
                    if (f1Var.getChildAt(i9) instanceof sj0) {
                        sj0 sj0Var = (sj0) f1Var.getChildAt(i9);
                        boolean z11 = sj0Var.f32480r;
                        rj0 rj0Var = sj0Var.f32475b;
                        if (z11 && (rj0Var.getImageReceiver().getLottieAnimation() != null || rj0Var.getImageReceiver().getAnimation() != null)) {
                            rj0Var.setVisibility(0);
                            sj0Var.f32474a.setVisibility(4);
                            if (sj0Var.f32481s) {
                                sj0Var.v = true;
                            }
                        }
                        sj0Var.invalidate();
                    }
                    i9++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.W;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(hg.r0.d(reaction));
        }
        this.T.l();
    }

    public void setTop(boolean z10) {
        this.H = z10;
    }

    public void setTransitionProgress(float f10) {
        this.v = f10;
        io ioVar = this.F0;
        if (ioVar != null) {
            ioVar.setReactionsTransitionProgress((this.G0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
        }
    }

    public void m() {
    }
}
