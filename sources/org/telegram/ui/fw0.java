package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class fw0 extends LinearLayout {

    public final TextView f38214a;

    public final TextView f38215b;

    public final FrameLayout f38216c;
    public final bw0 d;

    public final cw0 f38217e;

    public boolean f38218f;
    public boolean h;

    public final PremiumPreviewFragment f38219n;

    public fw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.f38219n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38216c = frameLayout;
        int i10 = premiumPreviewFragment.f35847c0;
        int i11 = i10 == 1 ? 175 : 190;
        addView(frameLayout, h7.z5.q(i11, i11, 1));
        bw0 bw0Var = new bw0(this, context, premiumPreviewFragment.f35848d0 ? 1 : 0, i10 == 1 ? 1 : 0, context);
        this.d = bw0Var;
        frameLayout.addView(bw0Var, h7.z5.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f38214a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, h7.z5.p(-2, -2, 0.0f, 1, 16, i10 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.f38215b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, h7.z5.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        cw0 cw0Var = new cw0(this, context);
        this.f38217e = cw0Var;
        cw0Var.setOverScrollMode(2);
        cw0Var.setLayoutManager(new f2.k0());
        cw0Var.setAdapter(new ew0(this, context));
        cw0Var.setOnItemClickListener(new i(this, 24));
        final Path path = new Path();
        final float[] fArr = new float[8];
        cw0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                cw0 cw0Var2 = this.f45266a.f38217e;
                View pressedChildView = cw0Var2.getPressedChildView();
                int iB = pressedChildView == null ? -1 : cw0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = cw0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (iB == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (iB == cw0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(cw0Var, h7.z5.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        long jI;
        hw0 hw0Var;
        String str;
        PremiumPreviewFragment premiumPreviewFragment = this.f38219n;
        ArrayList arrayList = premiumPreviewFragment.d;
        arrayList.clear();
        premiumPreviewFragment.f35849e = -1;
        premiumPreviewFragment.f35851f = null;
        if (premiumPreviewFragment.getMediaDataController().getPremiumPromo() != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().getPremiumPromo().period_options;
            int size = arrayList2.size();
            jI = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (!premiumPreviewFragment.getUserConfig().isPremium() || tL_premiumSubscriptionOption2.can_purchase_upgrade || tL_premiumSubscriptionOption2.current) {
                    hw0 hw0Var2 = new hw0(tL_premiumSubscriptionOption2);
                    arrayList.add(hw0Var2);
                    if (premiumPreviewFragment.f35852f0 && tL_premiumSubscriptionOption2.months == 12) {
                        premiumPreviewFragment.f35849e = arrayList.size() - 1;
                    }
                    if (tL_premiumSubscriptionOption2.current) {
                        premiumPreviewFragment.f35851f = hw0Var2;
                    }
                    if (BuildVars.useInvoiceBilling() && hw0Var2.i() > jI) {
                        jI = hw0Var2.i();
                    }
                }
            }
        } else {
            jI = 0;
        }
        if (BuildVars.useInvoiceBilling() && premiumPreviewFragment.getUserConfig().isPremium()) {
            arrayList.clear();
            premiumPreviewFragment.f35851f = null;
        } else if (BuildVars.useInvoiceBilling() || premiumPreviewFragment.f35851f == null) {
            hw0Var = premiumPreviewFragment.f35851f;
            if (hw0Var != null && hw0Var.f38895a.months == 12) {
                arrayList.clear();
                premiumPreviewFragment.f35851f = null;
            }
        } else {
            String lastPremiumTransaction = BillingController.getInstance().getLastPremiumTransaction();
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f35851f.f38895a;
            if (Objects.equals(lastPremiumTransaction, (tL_premiumSubscriptionOption3 == null || (str = tL_premiumSubscriptionOption3.transaction) == null) ? null : str.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"))) {
                hw0Var = premiumPreviewFragment.f35851f;
                if (hw0Var != null) {
                    arrayList.clear();
                    premiumPreviewFragment.f35851f = null;
                }
            } else {
                arrayList.clear();
                premiumPreviewFragment.f35851f = null;
            }
        }
        if (BuildVars.useInvoiceBilling()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((hw0) obj).f38898e = jI;
            }
        } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
            int size3 = arrayList.size();
            boolean z10 = false;
            int i12 = 0;
            long jI2 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                hw0 hw0Var3 = (hw0) obj2;
                hw0Var3.f38899f = BillingController.PREMIUM_PRODUCT_DETAILS;
                if (hw0Var3.i() > jI2) {
                    jI2 = hw0Var3.i();
                }
                hw0Var3.a();
                if (hw0Var3.f38900g != null) {
                    z10 = true;
                }
            }
            if (z10) {
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    hw0 hw0Var4 = (hw0) arrayList.get(i13);
                    hw0Var4.a();
                    if (hw0Var4.f38900g == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int size4 = arrayList.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj3 = arrayList.get(i14);
                i14++;
                ((hw0) obj3).f38898e = jI2;
            }
        }
        if (premiumPreviewFragment.f35849e == -1) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                if (((hw0) arrayList.get(i15)).f38895a.months == 12) {
                    premiumPreviewFragment.f35849e = i15;
                    break;
                }
            }
            if (premiumPreviewFragment.f35849e == -1) {
                premiumPreviewFragment.f35849e = 0;
            }
        }
        premiumPreviewFragment.t0(false);
        this.f38217e.getAdapter().l();
    }

    public final void b() {
        PremiumPreviewFragment premiumPreviewFragment = this.f38219n;
        int i10 = premiumPreviewFragment.f35847c0;
        TextView textView = this.f38214a;
        TextView textView2 = this.f38215b;
        if (i10 == 0) {
            textView.setText(LocaleController.getString(premiumPreviewFragment.f35858l0 ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramPremium));
            org.telegram.messenger.y1.p((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.f35858l0) ? R.string.TelegramPremiumSubscribedSubtitle : R.string.TelegramPremiumSubtitle, textView2);
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(premiumPreviewFragment.f35858l0 ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramBusiness));
            org.telegram.messenger.y1.p((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.f35858l0) ? R.string.TelegramBusinessSubscribedSubtitleTemp : R.string.TelegramBusinessSubtitleTemp, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), lh.w3.a(textView2.getText(), textView2.getPaint()));
        int i11 = 0;
        boolean z10 = premiumPreviewFragment.f35858l0 || BuildVars.IS_BILLING_UNAVAILABLE || premiumPreviewFragment.d.size() <= 1;
        boolean z11 = this.f38218f;
        cw0 cw0Var = this.f38217e;
        if (!z11 || !z10) {
            cw0Var.setVisibility(z10 ? 8 : 0);
            this.f38218f = true;
        } else if (cw0Var.getVisibility() == 0 && z10 && this.h == z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addUpdateListener(new aw0(this, cw0Var, duration, i11));
            duration.addListener(new org.telegram.ui.Components.fk0(10, this, cw0Var));
            duration.setInterpolator(org.telegram.ui.Components.er.f28122f);
            duration.start();
        }
        this.h = !z10;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
