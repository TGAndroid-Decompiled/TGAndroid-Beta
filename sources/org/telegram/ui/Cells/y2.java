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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.v11;
public final class y2 extends LinearLayout {
    public static final int f23756w = 0;
    public float f23757a;
    public Runnable f23758b;
    public q0.a f23759c;
    public boolean d;
    public ValueAnimator f23760e;
    public final fk0 f23761f;
    public final TextView h;
    public final v11 f23762n;
    public int f23763r;
    public int f23764s;
    public final int v;

    public y2(final Context context) {
        super(context);
        this.f23763r = -1;
        this.v = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new bi.d(5));
        ?? imageView = new ImageView(context);
        this.f23761f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.a(100.0f, 52.0f, 4.0f, 52.0f, 0.0f, 100, 17));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20965m9, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, w7.x5.a(-2.0f, 52.0f, 10.0f, 52.0f, 0.0f, -1, 51));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f23762n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20856g9, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, R.anim.alpha_in);
        viewSwitcher.setOutAnimation(context, R.anim.alpha_out);
        addView((View) viewSwitcher, w7.x5.a(-2.0f, 52.0f, 7.0f, 52.0f, 0.0f, -1, 51));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f23760e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.f23762n.a(string, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f23757a, 1.0f).setDuration(250L);
        this.f23760e = duration;
        duration.setInterpolator(au.d);
        this.f23760e.addUpdateListener(new w2(this, 0));
        this.f23760e.addListener(new x2(this, 1));
        this.f23760e.start();
    }

    public final void b() {
        int i10;
        int i11 = 0;
        if ((getParent() instanceof View) && (((i10 = this.f23763r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i11 = 0 - (getTop() / 2);
        }
        int i12 = this.f23763r;
        if (i12 == 0 || i12 == 1) {
            i11 -= (int) ((1.0f - this.f23757a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f7 = i11;
        this.f23761f.setTranslationY(f7);
        this.h.setTranslationY(f7);
        this.f23762n.setTranslationY(f7);
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
        int i12 = this.f23763r;
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
            if (getParent() instanceof org.telegram.ui.Components.la) {
                size2 -= ((org.telegram.ui.Components.la) getParent()).V2;
            }
            ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.v).hintDialogs;
            if (!arrayList.isEmpty()) {
                int dp = AndroidUtilities.dp(72.0f);
                size2 = bi.z(50.0f, (arrayList.size() + (arrayList.size() * dp)) - 1, size2);
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.f23757a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f23758b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f23759c = aVar;
    }
}
