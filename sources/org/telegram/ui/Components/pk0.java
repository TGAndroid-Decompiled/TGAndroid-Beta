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
public class pk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.b1 f27884h1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
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
    public oo G0;
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
    public e90 O0;
    public ah.d P;
    public int P0;
    public final ArrayList Q;
    public int Q0;
    public final ArrayList R;
    public float R0;
    public final ArrayList S;
    public float S0;
    public final org.telegram.ui.br T;
    public pg.b T0;
    public final fk0 U;
    public pg.b U0;
    public final RectF V;
    public pg.b V0;
    public boolean W;
    public ng.a W0;
    public qg.d X0;
    public boolean Y0;
    public boolean Z0;
    public boolean f27885a;
    public final HashSet f27886a0;
    public oo f27887a1;
    public final lh.e1 f27888b;
    public final HashSet f27889b0;
    public boolean f27890b1;
    public final float f27891c;
    public final int[] f27892c0;
    public boolean f27893c1;
    public final ArrayList d;
    public ok0 f27894d0;
    public boolean f27895d1;
    public final ArrayList e;
    public final Rect f27896e0;
    public Paint f27897e1;
    public final Paint f27898f;
    public final Drawable f27899f0;
    public Matrix f27900f1;
    public final boolean f27901g0;
    public LinearGradient f27902g1;
    public final Paint h;
    public final org.telegram.ui.ActionBar.f6 f27903h0;
    public mg.q0 f27904i0;
    public int f27905j0;
    public float f27906k0;
    public float f27907l0;
    public float m0;
    public final Paint f27908n;
    public float f27909n0;
    public boolean f27910o0;
    public long f27911p0;
    public org.telegram.ui.ActionBar.p2 f27912q0;
    public float f27913r;
    public eg.s1 f27914r0;
    public float f27915s;
    public pr f27916s0;
    public float f27917t0;
    public mg.d0 f27918u0;
    public float v;
    public ValueAnimator f27919v0;
    public final RectF f27920w;
    public final nk0 f27921w0;
    public final Path f27922x;
    public boolean f27923x0;
    public float f27924y;
    public float f27925y0;
    public final HashSet f27926z0;

    public pk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27885a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        boolean z4 = true;
        Paint paint = new Paint(1);
        this.f27898f = paint;
        this.h = new Paint(1);
        this.f27908n = new Paint(1);
        this.v = 1.0f;
        this.f27920w = new RectF();
        this.f27922x = new Path();
        this.f27924y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.B = dp;
        this.C = dp / 2.0f;
        this.D = AndroidUtilities.dp(36.0f);
        this.Q = new ArrayList(20);
        this.R = new ArrayList(10);
        this.S = new ArrayList(20);
        this.V = new RectF();
        this.W = false;
        this.f27886a0 = new HashSet();
        this.f27889b0 = new HashSet();
        this.f27892c0 = new int[2];
        Rect rect = new Rect();
        this.f27896e0 = rect;
        new ArrayList();
        this.f27926z0 = new HashSet();
        this.A0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.E0 = paint2;
        Paint paint3 = new Paint(1);
        this.F0 = paint3;
        this.I0 = new AnimationNotificationsLocker();
        this.L0 = true;
        this.f27893c1 = false;
        this.J0 = i10;
        this.f27891c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var));
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jj, f6Var));
        this.f27903h0 = f6Var;
        this.G = i11;
        this.f27912q0 = p2Var;
        nk0 nk0Var = new nk0(this, context);
        this.f27921w0 = nk0Var;
        nk0Var.setVisibility(8);
        nk0Var.L = false;
        nk0Var.f27301c.setVisibility(8);
        addView(nk0Var);
        this.f27901g0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f27899f0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Td, false), PorterDuff.Mode.MULTIPLY));
        lh.e1 e1Var = new lh.e1(this, context, 16);
        this.f27888b = e1Var;
        e1Var.setClipChildren(false);
        e1Var.setClipToPadding(false);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, 3);
        this.T = brVar;
        e1Var.i(new bk0(this, 0));
        e1Var.setLayoutManager(brVar);
        e1Var.setOverScrollMode(2);
        fk0 fk0Var = new fk0(this);
        this.U = fk0Var;
        e1Var.setAdapter(fk0Var);
        e1Var.j(new jk0(this));
        e1Var.j(new lb0(this, 2));
        e1Var.i(new bk0(this, 1));
        e1Var.setOnItemClickListener(new k(this, 11));
        e1Var.setOnItemLongClickListener((kl0) new gg.m2(this, i10, 8));
        addView(e1Var, k7.b6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (e1Var.getLayoutParams().height - e1Var.getPaddingTop()) - e1Var.getPaddingBottom();
        nk0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        nk0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(pk0 pk0Var) {
        if (pk0Var.f27918u0 != null) {
            return;
        }
        mg.d0 d0Var = new mg.d0(pk0Var.J0, pk0Var.f27912q0, pk0Var.S, pk0Var.f27886a0, pk0Var, pk0Var.f27903h0, pk0Var.f27885a);
        pk0Var.f27918u0 = d0Var;
        ng.a aVar = pk0Var.W0;
        boolean z4 = true;
        if (aVar != null) {
            qg.d dVar = pk0Var.X0;
            org.telegram.ui.g51 g51Var = d0Var.f13981m.f37601c0;
            g51Var.f33910x = true;
            g51Var.setBackground(null);
            g51Var.e();
            g51Var.invalidate();
            pg.b c3 = aVar.c(d0Var.f13972a, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            d0Var.f13993z = c3;
        }
        mg.d0 d0Var2 = pk0Var.f27918u0;
        ok0 ok0Var = pk0Var.f27894d0;
        if (ok0Var != null && !ok0Var.h()) {
            z4 = false;
        }
        d0Var2.f13981m.setLongPressEnabled(z4);
        pk0Var.j();
        pk0Var.f27918u0.f13984p = new cc0(pk0Var, 16);
        pk0Var.m();
    }

    public static void b(pk0 pk0Var, View view, float f10) {
        if (view instanceof nk0) {
            ((nk0) view).h = f10;
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
                        mg.q0 d = mg.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((mg.q0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        mg.d0 d0Var = this.f27918u0;
        if (d0Var != null) {
            if (!d0Var.f13985q) {
                d0Var.f13985q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new mg.y(d0Var, 0));
                ofFloat.addListener(new mg.b0(d0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f27918u0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19185id == this.H && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.E, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.J0 == 4) {
                invalidate();
                lh.e1 e1Var = this.f27888b;
                e1Var.invalidate();
                e1Var.f1();
                for (int i12 = 0; i12 < e1Var.getChildCount(); i12++) {
                    View childAt = e1Var.getChildAt(i12);
                    if (childAt instanceof nk0) {
                        nk0 nk0Var = (nk0) childAt;
                        nk0Var.f27299a.invalidate();
                        nk0Var.f27300b.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        mg.d0 d0Var = this.f27918u0;
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
        RectF rectF = this.f27920w;
        if (z4) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), nr.f27346f.getInterpolation(this.L)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            nr nrVar = nr.f27346f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f15, 0.0f, nrVar.getInterpolation(this.L)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), nrVar.getInterpolation(this.L)));
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
        Drawable drawable = this.f27899f0;
        drawable.setAlpha(i10);
        Paint paint = this.f27898f;
        paint.setAlpha(i10);
        float f17 = f16 - f10;
        float f18 = dp;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean s6 = this.f27894d0.s();
        float f23 = height;
        RectF rectF2 = this.V;
        if (s6) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f27894d0.n(canvas, rectF2, f13, getX(), getY(), i10, false);
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
        float lerp = AndroidUtilities.lerp(height2, (f26 + f18) - g(), nr.f27346f.getInterpolation(this.L));
        float f27 = (-AndroidUtilities.dp(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((lerp - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + lerp + f27));
        drawable.draw(canvas);
        if (this.f27894d0.s()) {
            rectF2.set(f25 - f12, lerp - f12, f25 + f12, lerp + f12);
            this.f27894d0.n(canvas, rectF2, f12, getX(), getY(), i10, false);
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

    public ok0 getDelegate() {
        return this.f27894d0;
    }

    public int getHintTextWidth() {
        return this.P0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.Q.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.f27925y0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public mg.d0 getReactionsWindow() {
        return this.f27918u0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f10;
        HashSet hashSet = this.f27886a0;
        if (hashSet.isEmpty()) {
            return "";
        }
        mg.q0 q0Var = (mg.q0) hashSet.iterator().next();
        long j10 = q0Var.f14108g;
        String str = null;
        if (j10 != 0 && (f10 = l5.f(this.G, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = q0Var.f14107f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<mg.q0> getSelectedReactions() {
        return this.f27886a0;
    }

    public float getTopOffset() {
        if (this.N0) {
            return ((FrameLayout.LayoutParams) this.f27888b.getLayoutParams()).topMargin;
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

    public List<mg.q0> getVisibleReactionsList() {
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
        mg.d0 d0Var = this.f27918u0;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f13974c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.J0;
        if (i11 == 4) {
            Iterator it = this.f27886a0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                mg.q0 q0Var = (mg.q0) it.next();
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
                mg.q0 c3 = mg.q0.c(enabledReactionsList.get(i10));
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
                        mg.q0 e = mg.q0.e(availableEffects.effects.get(i10));
                        if (!hashSet.contains(e)) {
                            hashSet.add(e);
                            arrayList.add(e);
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
                        mg.q0 d = mg.q0.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    mg.q0 d10 = mg.q0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    mg.q0 d11 = mg.q0.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.G).isPremium() || d11.f14108g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.G).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.G).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    mg.q0 d12 = mg.q0.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.G).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    mg.q0 c10 = mg.q0.c(enabledReactionsList2.get(i10));
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
                mg.q0 d13 = mg.q0.d(savedReactions.get(i10));
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
                arrayList.add(mg.q0.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            lh.e1 e1Var = this.f27888b;
            if (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                if (childAt instanceof nk0) {
                    ((nk0) childAt).f27300b.invalidate();
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.f27908n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, mg.q0 q0Var, boolean z4) {
        ok0 ok0Var = this.f27894d0;
        if (ok0Var != null) {
            ok0Var.i(view, q0Var, z4, true);
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
        this.f27905j0 = 0;
        this.f27906k0 = 0.0f;
        this.f27925y0 = 0.0f;
        this.f27904i0 = null;
        this.f27910o0 = false;
        ak0 ak0Var = new ak0(this, 1);
        lh.e1 e1Var = this.f27888b;
        AndroidUtilities.forEachViews((RecyclerView) e1Var, (h5.d) ak0Var);
        this.f27926z0.clear();
        e1Var.invalidate();
        ah.d dVar = this.P;
        if (dVar != null) {
            dVar.invalidate();
        }
        invalidate();
    }

    public final void o(ng.a aVar, qg.d dVar) {
        this.W0 = aVar;
        this.X0 = dVar;
        pg.b c3 = aVar.c(this, null, true);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        this.T0 = c3;
        pg.b c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.U0 = c10;
        pg.b c11 = aVar.c(this, null, true);
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
        this.f27923x0 = z11;
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
                obj.f14104a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.E.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(mg.q0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.W = true;
                ?? obj2 = new Object();
                obj2.f14104a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.G).getChat(Long.valueOf(chatFull.f19185id));
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
                                arrayList2.add(mg.q0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(mg.q0.d(reaction2));
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
                hashSet.add((mg.q0) arrayList2.get(i16));
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
                arrayList5.add((mg.q0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                nk0.a(this.f27921w0, (mg.q0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.D0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((mg.q0) arrayList5.get(i18)).f14108g != 0) {
                this.D0 = false;
            }
        }
        ArrayList arrayList6 = this.S;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        fk0 fk0Var = this.U;
        pk0 pk0Var = fk0Var.d;
        ArrayList arrayList7 = pk0Var.e;
        ArrayList arrayList8 = pk0Var.Q;
        ArrayList arrayList9 = pk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            mg.q0 q0Var = (mg.q0) arrayList8.get(i19);
            if (q0Var.f14107f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new gk0(i11, q0Var));
        }
        if (!pk0Var.R.isEmpty() && !MessagesController.getInstance(pk0Var.G).premiumFeaturesBlocked()) {
            arrayList9.add(new gk0(1, null));
        }
        if (pk0Var.q()) {
            arrayList9.add(new gk0(2, null));
        }
        if (z4) {
            fk0Var.E(arrayList7, arrayList9);
        } else {
            fk0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f27886a0.add(mg.q0.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
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
        org.telegram.ui.Cells.b1 b1Var = f27884h1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new ck0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.f27926z0.clear();
            int i10 = 0;
            while (true) {
                lh.e1 e1Var = this.f27888b;
                if (i10 >= e1Var.getChildCount()) {
                    break;
                }
                if (e1Var.getChildAt(i10) instanceof nk0) {
                    ((nk0) e1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.R0 = f10;
    }

    public void setChatScrimView(oo ooVar) {
        this.f27887a1 = ooVar;
    }

    public void setCurrentAccount(int i10) {
        this.G = i10;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f27917t0 = f10;
        oo ooVar = this.f27887a1;
        if (ooVar != null) {
            ooVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z4) {
        if (z4) {
            this.f27916s0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 40)));
        } else {
            this.f27916s0.setBackground(null);
        }
    }

    public void setDelegate(ok0 ok0Var) {
        this.f27894d0 = ok0Var;
    }

    public void setFlippedVertically(boolean z4) {
        this.K = z4;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f27912q0 = p2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.N0 = true;
        if (this.O0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.f27903h0;
            e90 e90Var = new e90(context, f6Var);
            this.O0 = e90Var;
            e90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.O0.setClickable(true);
            this.O0.setTextSize(1, 12.0f);
            int i10 = this.J0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                this.O0.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, f6Var));
            } else {
                this.O0.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                this.O0.setAlpha(0.5f);
            }
            this.O0.setGravity(1);
            addView(this.O0, k7.b6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.O0.setText(charSequence);
        this.f27890b1 = false;
        ((FrameLayout.LayoutParams) this.f27921w0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f27888b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
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

    public void setParentLayout(oo ooVar) {
        this.G0 = ooVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            mg.q0 b10 = mg.q0.b(str);
            hashSet.add(b10);
            this.f27889b0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f27888b, (h5.d) new ak0(this, 0));
    }

    public void setSelectedReaction(mg.q0 q0Var) {
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        this.U.l();
    }

    public void setSelectedReactionAnimated(mg.q0 q0Var) {
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f27888b, (h5.d) new ak0(this, 0));
    }

    public void setSelectedReactionInclusive(mg.q0 q0Var) {
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f27888b, (h5.d) new ak0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(mg.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.U.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f27888b, (h5.d) new ak0(this, 0));
    }

    public void setSkipDraw(boolean z4) {
        if (this.Z0 != z4) {
            this.Z0 = z4;
            if (!z4) {
                int i10 = 0;
                while (true) {
                    lh.e1 e1Var = this.f27888b;
                    if (i10 >= e1Var.getChildCount()) {
                        break;
                    }
                    if (e1Var.getChildAt(i10) instanceof nk0) {
                        nk0 nk0Var = (nk0) e1Var.getChildAt(i10);
                        boolean z10 = nk0Var.f27304r;
                        mk0 mk0Var = nk0Var.f27300b;
                        if (z10 && (mk0Var.getImageReceiver().getLottieAnimation() != null || mk0Var.getImageReceiver().getAnimation() != null)) {
                            mk0Var.setVisibility(0);
                            nk0Var.f27299a.setVisibility(4);
                            if (nk0Var.f27305s) {
                                nk0Var.v = true;
                            }
                        }
                        nk0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f27886a0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(mg.q0.d(reaction));
        }
        this.U.l();
    }

    public void setTop(boolean z4) {
        this.I = z4;
    }

    public void setTransitionProgress(float f10) {
        this.v = f10;
        oo ooVar = this.G0;
        if (ooVar != null) {
            ooVar.setReactionsTransitionProgress((this.H0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
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
