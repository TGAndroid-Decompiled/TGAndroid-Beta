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
public class qk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.b1 f30422h1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
    public final HashSet A0;
    public final float B;
    public boolean B0;
    public final float C;
    public boolean C0;
    public int D;
    public boolean D0;
    public MessageObject E;
    public final Paint E0;
    public boolean F;
    public final Paint F0;
    public int G;
    public qo G0;
    public long H;
    public boolean H0;
    public boolean I;
    public final AnimationNotificationsLocker I0;
    public boolean J;
    public final int J0;
    public boolean K;
    public boolean K0;
    public float L;
    public boolean L0;
    public long M;
    public Runnable M0;
    public ValueAnimator N;
    public boolean N0;
    public FrameLayout O;
    public g90 O0;
    public ag.l P;
    public int P0;
    public final ArrayList Q;
    public int Q0;
    public final ArrayList R;
    public float R0;
    public final ArrayList S;
    public float S0;
    public final org.telegram.ui.cr T;
    public qg.b T0;
    public final gk0 U;
    public qg.b U0;
    public final RectF V;
    public qg.b V0;
    public boolean W;
    public og.a W0;
    public rg.d X0;
    public boolean Y0;
    public boolean Z0;
    public boolean f30423a;
    public final HashSet f30424a0;
    public qo f30425a1;
    public final mh.d1 f30426b;
    public final HashSet f30427b0;
    public boolean f30428b1;
    public final float f30429c;
    public final int[] f30430c0;
    public boolean f30431c1;
    public final ArrayList d;
    public pk0 f30432d0;
    public boolean f30433d1;
    public final ArrayList f30434e;
    public final Rect f30435e0;
    public Paint f30436e1;
    public final Paint f30437f;
    public final Drawable f30438f0;
    public Matrix f30439f1;
    public final boolean f30440g0;
    public LinearGradient f30441g1;
    public final Paint h;
    public final org.telegram.ui.ActionBar.g6 f30442h0;
    public ng.q0 f30443i0;
    public int f30444j0;
    public float f30445k0;
    public float f30446l0;
    public float m0;
    public final Paint f30447n;
    public float f30448n0;
    public boolean f30449o0;
    public long f30450p0;
    public org.telegram.ui.ActionBar.p2 f30451q0;
    public float f30452r;
    public fg.r1 f30453r0;
    public float f30454s;
    public rr f30455s0;
    public float f30456t0;
    public ng.d0 f30457u0;
    public float v;
    public ValueAnimator f30458v0;
    public final RectF f30459w;
    public final ok0 f30460w0;
    public final Path f30461x;
    public boolean f30462x0;
    public float f30463y;
    public float f30464y0;
    public final HashSet f30465z0;

    public qk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30423a = false;
        this.d = new ArrayList();
        this.f30434e = new ArrayList();
        boolean z4 = true;
        Paint paint = new Paint(1);
        this.f30437f = paint;
        this.h = new Paint(1);
        this.f30447n = new Paint(1);
        this.v = 1.0f;
        this.f30459w = new RectF();
        this.f30461x = new Path();
        this.f30463y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.B = dp;
        this.C = dp / 2.0f;
        this.D = AndroidUtilities.dp(36.0f);
        this.Q = new ArrayList(20);
        this.R = new ArrayList(10);
        this.S = new ArrayList(20);
        this.V = new RectF();
        this.W = false;
        this.f30424a0 = new HashSet();
        this.f30427b0 = new HashSet();
        this.f30430c0 = new int[2];
        Rect rect = new Rect();
        this.f30435e0 = rect;
        new ArrayList();
        this.f30465z0 = new HashSet();
        this.A0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.E0 = paint2;
        Paint paint3 = new Paint(1);
        this.F0 = paint3;
        this.I0 = new AnimationNotificationsLocker();
        this.L0 = true;
        this.f30431c1 = false;
        this.J0 = i10;
        this.f30429c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jj, g6Var));
        this.f30442h0 = g6Var;
        this.G = i11;
        this.f30451q0 = p2Var;
        ok0 ok0Var = new ok0(this, context);
        this.f30460w0 = ok0Var;
        ok0Var.setVisibility(8);
        ok0Var.L = false;
        ok0Var.f29793c.setVisibility(8);
        addView(ok0Var);
        this.f30440g0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f30438f0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Td, false), PorterDuff.Mode.MULTIPLY));
        mh.d1 d1Var = new mh.d1(this, context, 16);
        this.f30426b = d1Var;
        d1Var.setClipChildren(false);
        d1Var.setClipToPadding(false);
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((ViewGroup) this, 3);
        this.T = crVar;
        d1Var.i(new ck0(this, 0));
        d1Var.setLayoutManager(crVar);
        d1Var.setOverScrollMode(2);
        gk0 gk0Var = new gk0(this);
        this.U = gk0Var;
        d1Var.setAdapter(gk0Var);
        d1Var.j(new kk0(this));
        d1Var.j(new nb0(this, 2));
        d1Var.i(new ck0(this, 1));
        d1Var.setOnItemClickListener(new k(this, 11));
        d1Var.setOnItemLongClickListener((kl0) new hg.m2(this, i10, 8));
        addView(d1Var, k7.c6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (d1Var.getLayoutParams().height - d1Var.getPaddingTop()) - d1Var.getPaddingBottom();
        ok0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        ok0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(qk0 qk0Var) {
        if (qk0Var.f30457u0 != null) {
            return;
        }
        ng.d0 d0Var = new ng.d0(qk0Var.J0, qk0Var.f30451q0, qk0Var.S, qk0Var.f30424a0, qk0Var, qk0Var.f30442h0, qk0Var.f30423a);
        qk0Var.f30457u0 = d0Var;
        og.a aVar = qk0Var.W0;
        boolean z4 = true;
        if (aVar != null) {
            rg.d dVar = qk0Var.X0;
            org.telegram.ui.n51 n51Var = d0Var.f16045m.f42309c0;
            n51Var.f38560x = true;
            n51Var.setBackground(null);
            n51Var.e();
            n51Var.invalidate();
            qg.b c3 = aVar.c(d0Var.f16035a, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            d0Var.f16057z = c3;
        }
        ng.d0 d0Var2 = qk0Var.f30457u0;
        pk0 pk0Var = qk0Var.f30432d0;
        if (pk0Var != null && !pk0Var.g()) {
            z4 = false;
        }
        d0Var2.f16045m.setLongPressEnabled(z4);
        qk0Var.j();
        qk0Var.f30457u0.f16048p = new ec0(qk0Var, 16);
        qk0Var.m();
    }

    public static void b(qk0 qk0Var, View view, float f10) {
        if (view instanceof ok0) {
            ((ok0) view).h = f10;
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
        int i10 = 0;
        boolean z4 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        ng.q0 d = ng.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
                        if (z4 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z4 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((ng.q0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        ng.d0 d0Var = this.f30457u0;
        if (d0Var != null) {
            if (!d0Var.f16049q) {
                d0Var.f16049q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ng.y(d0Var, 0));
                ofFloat.addListener(new ng.b0(d0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f30457u0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20846id == this.H && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.E, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.J0 == 4) {
                invalidate();
                mh.d1 d1Var = this.f30426b;
                d1Var.invalidate();
                d1Var.e1();
                for (int i12 = 0; i12 < d1Var.getChildCount(); i12++) {
                    View childAt = d1Var.getChildAt(i12);
                    if (childAt instanceof ok0) {
                        ok0 ok0Var = (ok0) childAt;
                        ok0Var.f29791a.invalidate();
                        ok0Var.f29792b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i10 == NotificationCenter.availableEffectsUpdate) {
            p(this.E, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ng.d0 d0Var = this.f30457u0;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i10, Canvas canvas) {
        int i11;
        float height;
        float f13;
        float f14;
        float height2;
        if (this.J0 == 1) {
            return;
        }
        canvas.save();
        boolean z4 = this.I;
        RectF rectF = this.f30459w;
        if (z4) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), pr.f30168f.getInterpolation(this.L)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            pr prVar = pr.f30168f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f15, 0.0f, prVar.getInterpolation(this.L)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), prVar.getInterpolation(this.L)));
        }
        if (!LocaleController.isRTL && !this.J) {
            i11 = getWidth() - this.D;
        } else {
            i11 = this.D;
        }
        float f16 = i11 + this.R0;
        if (this.I) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f30438f0;
        drawable.setAlpha(i10);
        Paint paint = this.f30437f;
        paint.setAlpha(i10);
        float f17 = f16 - f10;
        float f18 = dp;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean t6 = this.f30432d0.t();
        float f23 = height;
        RectF rectF2 = this.V;
        if (t6) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f30432d0.j(canvas, rectF2, f13, getX(), getY(), i10, false);
        } else {
            f13 = f10;
            if (this.U0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f17, f20, f21, f22);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.U0.setBounds(rect);
                this.U0.setAlpha(paint.getAlpha());
                this.U0.draw(canvas);
            } else {
                canvas.drawCircle(f16, f23, f13, paint);
            }
        }
        boolean z10 = LocaleController.isRTL;
        float f24 = this.B;
        if (!z10 && !this.J) {
            f14 = (getWidth() - this.D) + f24;
        } else {
            f14 = this.D - f24;
        }
        float f25 = this.R0 + this.S0 + f14;
        boolean z11 = this.I;
        float f26 = this.C;
        if (z11) {
            height2 = (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f);
        } else {
            height2 = ((getHeight() - f26) - f18) + g();
        }
        float lerp = AndroidUtilities.lerp(height2, (f26 + f18) - g(), pr.f30168f.getInterpolation(this.L));
        float f27 = (-AndroidUtilities.dp(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((lerp - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + lerp + f27));
        drawable.draw(canvas);
        if (this.f30432d0.t()) {
            rectF2.set(f25 - f12, lerp - f12, f25 + f12, lerp + f12);
            this.f30432d0.j(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else if (this.V0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(f25 - f12, lerp - f12, f25 + f12, lerp + f12);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.V0.setBounds(rect2);
            this.V0.setAlpha(paint.getAlpha());
            this.V0.draw(canvas);
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

    public pk0 getDelegate() {
        return this.f30432d0;
    }

    public int getHintTextWidth() {
        return this.P0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.Q.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.f30464y0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public ng.d0 getReactionsWindow() {
        return this.f30457u0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f10;
        HashSet hashSet = this.f30424a0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ng.q0 q0Var = (ng.q0) hashSet.iterator().next();
        long j10 = q0Var.f16181g;
        String str = null;
        if (j10 != 0 && (f10 = l5.f(this.G, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = q0Var.f16180f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<ng.q0> getSelectedReactions() {
        return this.f30424a0;
    }

    public float getTopOffset() {
        if (this.N0) {
            return ((FrameLayout.LayoutParams) this.f30426b.getLayoutParams()).topMargin;
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

    public List<ng.q0> getVisibleReactionsList() {
        return this.Q;
    }

    public int getWindowType() {
        int i10 = this.J0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        if (this.C0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        ng.d0 d0Var = this.f30457u0;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f16037c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.J0;
        if (i11 == 4) {
            Iterator it = this.f30424a0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                ng.q0 q0Var = (ng.q0) it.next();
                if (!hashSet.contains(q0Var)) {
                    hashSet.add(q0Var);
                    arrayList.add(q0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.G).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                ng.q0 c3 = ng.q0.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(c3)) {
                    hashSet.add(c3);
                    arrayList.add(c3);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
        } else if (this.B0 && i11 != 4) {
            if (i11 == 5) {
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.G).getAvailableEffects();
                if (availableEffects != null) {
                    while (i10 < availableEffects.effects.size()) {
                        ng.q0 e6 = ng.q0.e(availableEffects.effects.get(i10));
                        if (!hashSet.contains(e6)) {
                            hashSet.add(e6);
                            arrayList.add(e6);
                        }
                        i10++;
                    }
                    return;
                }
                return;
            }
            if (i11 == 3) {
                topReactions = MediaDataController.getInstance(this.G).getSavedReactions();
            } else {
                topReactions = MediaDataController.getInstance(this.G).getTopReactions();
            }
            if (i11 == 3) {
                TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.G).getSavedReactionTags(0L);
                if (savedReactionTags != null) {
                    for (int i13 = 0; i13 < savedReactionTags.tags.size(); i13++) {
                        ng.q0 d = ng.q0.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    ng.q0 d10 = ng.q0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    ng.q0 d11 = ng.q0.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.G).isPremium() || d11.f16181g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.G).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.G).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    ng.q0 d12 = ng.q0.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.G).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    ng.q0 c10 = ng.q0.c(enabledReactionsList2.get(i10));
                    if (!hashSet.contains(c10)) {
                        hashSet.add(c10);
                        arrayList.add(c10);
                    }
                    i10++;
                }
            }
        } else if (i11 == 3) {
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.G).getSavedReactions();
            int i17 = 0;
            while (i10 < savedReactions.size()) {
                ng.q0 d13 = ng.q0.d(savedReactions.get(i10));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                    i17++;
                }
                if (i17 != 16) {
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.G).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                arrayList.add(ng.q0.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            mh.d1 d1Var = this.f30426b;
            if (i10 < d1Var.getChildCount()) {
                View childAt = d1Var.getChildAt(i10);
                if (childAt instanceof ok0) {
                    ((ok0) childAt).f29792b.invalidate();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.f30447n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ng.q0 q0Var, boolean z4) {
        pk0 pk0Var = this.f30432d0;
        if (pk0Var != null) {
            pk0Var.o(view, q0Var, z4, true);
        }
        if (this.J0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.L0 = true;
        this.f30444j0 = 0;
        this.f30445k0 = 0.0f;
        this.f30464y0 = 0.0f;
        this.f30443i0 = null;
        this.f30449o0 = false;
        bk0 bk0Var = new bk0(this, 1);
        mh.d1 d1Var = this.f30426b;
        AndroidUtilities.forEachViews((RecyclerView) d1Var, (h5.d) bk0Var);
        this.f30465z0.clear();
        d1Var.invalidate();
        ag.l lVar = this.P;
        if (lVar != null) {
            lVar.invalidate();
        }
        invalidate();
    }

    public final void o(og.a aVar, rg.d dVar) {
        this.W0 = aVar;
        this.X0 = dVar;
        qg.b c3 = aVar.c(this, null, true);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        this.T0 = c3;
        qg.b c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.U0 = c10;
        qg.b c11 = aVar.c(this, null, true);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(4.0f));
        c11.o(AndroidUtilities.dp(8.0f));
        this.V0 = c11;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.J0 == 5) {
            NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.J0 == 5) {
            NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z4) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i11;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.E = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i12 = 0;
            while (i12 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i12);
                i12++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        int i13 = this.J0;
        if (i13 == 0 && this.E != null && i10 >= MessagesController.getInstance(this.G).getChatMaxUniqReactions(this.E.getDialogId())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F = z10;
        if (i13 == 0 && this.E != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.G).getChat(Long.valueOf(-this.E.getDialogId())))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30462x0 = z11;
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.G).getChatFull(-messageObject.getFromChatId())) == null) {
            this.H = -messageObject.getFromChatId();
            MessagesController.getInstance(this.G).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.W = false;
        if (i13 == 3) {
            this.B0 = UserConfig.getInstance(this.G).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.B0 = true;
            h(arrayList2);
        } else if (this.F) {
            this.B0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.W = true;
                ?? obj = new Object();
                obj.f16176a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.E.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(ng.q0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.W = true;
                ?? obj2 = new Object();
                obj2.f16176a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.G).getChat(Long.valueOf(chatFull.f20846id));
                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.B0 = true;
                } else {
                    this.B0 = false;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i15);
                    i15++;
                    TLRPC.Reaction reaction2 = reaction;
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.G).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(ng.q0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(ng.q0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.B0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((ng.q0) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.F && ((!this.B0 && arrayList2.size() > 16) || (this.B0 && !UserConfig.getInstance(this.G).isPremium() && MessagesController.getInstance(this.G).premiumFeaturesBlocked()))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.C0 = z12;
        if (i13 == 3 && !UserConfig.getInstance(this.G).isPremium()) {
            this.C0 = false;
        }
        if (i13 == 4) {
            this.C0 = true;
        }
        ArrayList arrayList5 = this.Q;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            if (dp < 1) {
                dp = 1;
            }
            int i17 = 0;
            while (i17 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((ng.q0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                ok0.a(this.f30460w0, (ng.q0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.D0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((ng.q0) arrayList5.get(i18)).f16181g != 0) {
                this.D0 = false;
            }
        }
        ArrayList arrayList6 = this.S;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        gk0 gk0Var = this.U;
        qk0 qk0Var = gk0Var.d;
        ArrayList arrayList7 = qk0Var.f30434e;
        ArrayList arrayList8 = qk0Var.Q;
        ArrayList arrayList9 = qk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            ng.q0 q0Var = (ng.q0) arrayList8.get(i19);
            if (q0Var.f16180f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new hk0(i11, q0Var));
        }
        if (!qk0Var.R.isEmpty() && !MessagesController.getInstance(qk0Var.G).premiumFeaturesBlocked()) {
            arrayList9.add(new hk0(1, null));
        }
        if (qk0Var.q()) {
            arrayList9.add(new hk0(2, null));
        }
        if (z4) {
            gk0Var.E(arrayList7, arrayList9);
        } else {
            gk0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f30424a0.add(ng.q0.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.B0 && !this.C0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z4) {
        ObjectAnimator duration;
        this.H0 = z4;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.I0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.b1 b1Var = f30422h1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new dk0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.f30465z0.clear();
            int i10 = 0;
            while (true) {
                mh.d1 d1Var = this.f30426b;
                if (i10 >= d1Var.getChildCount()) {
                    break;
                }
                if (d1Var.getChildAt(i10) instanceof ok0) {
                    ((ok0) d1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.R0 = f10;
    }

    public void setChatScrimView(qo qoVar) {
        this.f30425a1 = qoVar;
    }

    public void setCurrentAccount(int i10) {
        this.G = i10;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f30456t0 = f10;
        qo qoVar = this.f30425a1;
        if (qoVar != null) {
            qoVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z4) {
        if (z4) {
            this.f30455s0.setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 40)));
        } else {
            this.f30455s0.setBackground(null);
        }
    }

    public void setDelegate(pk0 pk0Var) {
        this.f30432d0 = pk0Var;
    }

    public void setFlippedVertically(boolean z4) {
        this.K = z4;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f30451q0 = p2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.N0 = true;
        if (this.O0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.f30442h0;
            g90 g90Var = new g90(context, g6Var);
            this.O0 = g90Var;
            g90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.O0.setClickable(true);
            this.O0.setTextSize(1, 12.0f);
            int i10 = this.J0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                this.O0.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z6, g6Var));
            } else {
                this.O0.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
                this.O0.setAlpha(0.5f);
            }
            this.O0.setGravity(1);
            addView(this.O0, k7.c6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.O0.setText(charSequence);
        this.f30428b1 = false;
        ((FrameLayout.LayoutParams) this.f30460w0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f30426b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.S0 = f10;
    }

    public void setMirrorX(boolean z4) {
        this.J = z4;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.M0 = runnable;
    }

    public void setParentLayout(qo qoVar) {
        this.G0 = qoVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ng.q0 b10 = ng.q0.b(str);
            hashSet.add(b10);
            this.f30427b0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f30426b, (h5.d) new bk0(this, 0));
    }

    public void setSelectedReaction(ng.q0 q0Var) {
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        this.U.l();
    }

    public void setSelectedReactionAnimated(ng.q0 q0Var) {
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f30426b, (h5.d) new bk0(this, 0));
    }

    public void setSelectedReactionInclusive(ng.q0 q0Var) {
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f30426b, (h5.d) new bk0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(ng.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.U.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f30426b, (h5.d) new bk0(this, 0));
    }

    public void setSkipDraw(boolean z4) {
        if (this.Z0 != z4) {
            this.Z0 = z4;
            if (!z4) {
                int i10 = 0;
                while (true) {
                    mh.d1 d1Var = this.f30426b;
                    if (i10 >= d1Var.getChildCount()) {
                        break;
                    }
                    if (d1Var.getChildAt(i10) instanceof ok0) {
                        ok0 ok0Var = (ok0) d1Var.getChildAt(i10);
                        boolean z10 = ok0Var.f29797r;
                        nk0 nk0Var = ok0Var.f29792b;
                        if (z10 && (nk0Var.getImageReceiver().getLottieAnimation() != null || nk0Var.getImageReceiver().getAnimation() != null)) {
                            nk0Var.setVisibility(0);
                            ok0Var.f29791a.setVisibility(4);
                            if (ok0Var.f29798s) {
                                ok0Var.v = true;
                            }
                        }
                        ok0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f30424a0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ng.q0.d(reaction));
        }
        this.U.l();
    }

    public void setTop(boolean z4) {
        this.I = z4;
    }

    public void setTransitionProgress(float f10) {
        this.v = f10;
        qo qoVar = this.G0;
        if (qoVar != null) {
            qoVar.setReactionsTransitionProgress((this.H0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
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
