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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.j01;
public final class v2 extends LinearLayout {
    public static final int f25820w = 0;
    public float f25821a;
    public Runnable f25822b;
    public q0.a f25823c;
    public boolean d;
    public ValueAnimator f25824e;
    public final aj0 f25825f;
    public final TextView h;
    public final j01 f25826n;
    public int f25827r;
    public int f25828s;
    public final int v;

    public v2(final Context context) {
        super(context);
        this.f25827r = -1;
        this.v = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new mh.d(5));
        ?? imageView = new ImageView(context);
        this.f25825f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, i7.f6.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23226m9, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, i7.f6.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f25826n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23120g9, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, R.anim.alpha_in);
        viewSwitcher.setOutAnimation(context, R.anim.alpha_out);
        addView((View) viewSwitcher, i7.f6.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f25824e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.f25826n.a(string, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f25821a, 1.0f).setDuration(250L);
        this.f25824e = duration;
        duration.setInterpolator(ct.d);
        this.f25824e.addUpdateListener(new t2(this, 0));
        this.f25824e.addListener(new u2(this, 1));
        this.f25824e.start();
    }

    public final void b() {
        int i10;
        int i11 = 0;
        if ((getParent() instanceof View) && (((i10 = this.f25827r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i11 = 0 - (getTop() / 2);
        }
        int i12 = this.f25827r;
        if (i12 == 0 || i12 == 1) {
            i11 -= (int) ((1.0f - this.f25821a) * (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
        }
        float f9 = i11;
        this.f25825f.setTranslationY(f9);
        this.h.setTranslationY(f9);
        this.f25826n.setTranslationY(f9);
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
        int i12 = this.f25827r;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= AndroidUtilities.statusBarHeight;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i11);
            }
            if (size2 == 0) {
                size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (getParent() instanceof org.telegram.ui.Components.fa) {
                size2 -= ((org.telegram.ui.Components.fa) getParent()).T2;
            }
            ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.v).hintDialogs;
            if (!arrayList.isEmpty()) {
                int dp = AndroidUtilities.dp(72.0f);
                size2 = org.telegram.ui.b.u(50.0f, (arrayList.size() + (arrayList.size() * dp)) - 1, size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size = (view2.getMeasuredHeight() - view2.getPaddingTop()) - view2.getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (size == 0) {
            size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.f25821a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f25822b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f25823c = aVar;
    }
}
