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
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.u01;
public final class x2 extends LinearLayout {
    public static final int f24391w = 0;
    public float f24392a;
    public Runnable f24393b;
    public q0.a f24394c;
    public boolean d;
    public ValueAnimator f24395e;
    public final kj0 f24396f;
    public final TextView h;
    public final u01 f24397n;
    public int f24398r;
    public int f24399s;
    public final int v;

    public x2(final Context context) {
        super(context);
        this.f24398r = -1;
        this.v = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new org.telegram.ui.ActionBar.s2(4));
        ?? imageView = new ImageView(context);
        this.f24396f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.c6.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.m9, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, k7.c6.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f24397n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21719g9, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, R.anim.alpha_in);
        viewSwitcher.setOutAnimation(context, R.anim.alpha_out);
        addView((View) viewSwitcher, k7.c6.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z4) {
        ValueAnimator valueAnimator = this.f24395e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z4) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.f24397n.a(string, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f24392a, 1.0f).setDuration(250L);
        this.f24395e = duration;
        duration.setInterpolator(jt.d);
        this.f24395e.addUpdateListener(new v2(this, 0));
        this.f24395e.addListener(new w2(this, 1));
        this.f24395e.start();
    }

    public final void b() {
        int i10;
        int i11 = 0;
        if ((getParent() instanceof View) && (((i10 = this.f24398r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i11 = 0 - (getTop() / 2);
        }
        int i12 = this.f24398r;
        if (i12 == 0 || i12 == 1) {
            i11 -= (int) ((1.0f - this.f24392a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i11;
        this.f24396f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.f24397n.setTranslationY(f10);
    }

    @Override
    public final void offsetTopAndBottom(int i10) {
        super.offsetTopAndBottom(i10);
        b();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int size2;
        int i12 = this.f24398r;
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
                size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (getParent() instanceof org.telegram.ui.Components.aa) {
                size2 -= ((org.telegram.ui.Components.aa) getParent()).U2;
            }
            ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.v).hintDialogs;
            if (!arrayList.isEmpty()) {
                int dp = AndroidUtilities.dp(72.0f);
                size2 = org.telegram.ui.b.t(50.0f, (arrayList.size() + (arrayList.size() * dp)) - 1, size2);
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
            size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.f24392a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f24393b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f24394c = aVar;
    }
}
