package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.zz0;

public final class v2 extends LinearLayout {

    public static final int f25790w = 0;

    public float f25791a;

    public Runnable f25792b;

    public q0.a f25793c;
    public boolean d;

    public ValueAnimator f25794e;

    public final ri0 f25795f;
    public final TextView h;

    public final zz0 f25796n;

    public int f25797r;

    public int f25798s;
    public final int v;

    public v2(final Context context) {
        super(context);
        this.f25797r = -1;
        this.v = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new kh.e(5));
        ri0 ri0Var = new ri0(context);
        this.f25795f = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        ri0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23218m9, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, h7.z5.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        zz0 zz0Var = new zz0(context);
        this.f25796n = zz0Var;
        zz0Var.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23111g9, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        zz0Var.setInAnimation(context, R.anim.alpha_in);
        zz0Var.setOutAnimation(context, R.anim.alpha_out);
        addView(zz0Var, h7.z5.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f25794e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.f25796n.a(string, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f25791a, 1.0f).setDuration(250L);
        this.f25794e = duration;
        duration.setInterpolator(ws.d);
        this.f25794e.addUpdateListener(new t2(this, 0));
        this.f25794e.addListener(new u2(this, 1));
        this.f25794e.start();
    }

    public final void b() {
        int i10;
        int currentActionBarHeight = 0;
        if ((getParent() instanceof View) && (((i10 = this.f25797r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            currentActionBarHeight = 0 - (getTop() / 2);
        }
        int i11 = this.f25797r;
        if (i11 == 0 || i11 == 1) {
            currentActionBarHeight -= (int) ((1.0f - this.f25791a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = currentActionBarHeight;
        this.f25795f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.f25796n.setTranslationY(f10);
    }

    @Override
    public final void offsetTopAndBottom(int i10) {
        super.offsetTopAndBottom(i10);
        b();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int size2;
        int i12 = this.f25797r;
        if (i12 == 0 || i12 == 1) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i11);
            }
            if (size == 0) {
                size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.f25791a) + size), 1073741824));
            return;
        }
        if (i12 != 2 && i12 != 3) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= AndroidUtilities.statusBarHeight;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i11);
        }
        if (size2 == 0) {
            size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
        }
        if (getParent() instanceof org.telegram.ui.Components.y9) {
            size2 -= ((org.telegram.ui.Components.y9) getParent()).T2;
        }
        ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.v).hintDialogs;
        if (!arrayList.isEmpty()) {
            size2 = rl.u(50.0f, (arrayList.size() + (arrayList.size() * AndroidUtilities.dp(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f25792b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f25793c = aVar;
    }
}
