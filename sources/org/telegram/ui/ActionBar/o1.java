package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
public class o1 extends PopupWindow {
    public static Method f22901k;
    public static final Field f22902l;
    public static final DecelerateInterpolator f22903m = new DecelerateInterpolator();
    public static final h1 f22904n;
    public AnimatorSet f22905a;
    public boolean f22906b;
    public int f22907c;
    public boolean d;
    public boolean e;
    public long f22908f;
    public boolean f22909g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver f22910i;
    public AnimationNotificationsLocker f22911j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f22902l = field;
        f22904n = new h1(0);
    }

    public o1(View view, int i10, int i11) {
        super(view, i10, i11);
        this.f22906b = true;
        this.f22907c = 150;
        this.f22908f = -1L;
        this.f22911j = new AnimationNotificationsLocker();
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22360n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f7 = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.f22365y;
        hashMap.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < itemsCount; i11++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
            if (!(childAt instanceof l1)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i10));
                    i10++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.v) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22362s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22362s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f7 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x0(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22356a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22357b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f7), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255), ofFloat);
        animatorSet.setDuration((i10 * 16) + 150);
        animatorSet.addListener(new h(actionBarPopupWindow$ActionBarPopupWindowLayout, 1));
        animatorSet.start();
    }

    public final void b() {
        c(0.2f);
    }

    public final void c(float f7) {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f7;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public void d(boolean z10) {
        float f7;
        ArrayList arrayList;
        long j10 = this.f22908f;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i10 = layoutParams.flags;
                if ((i10 & 2) != 0) {
                    layoutParams.flags = i10 & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.f22905a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (!z10 || !this.d) {
                animatorSet.cancel();
                this.f22905a = null;
            } else {
                return;
            }
        }
        this.d = false;
        if (this.f22906b && z10) {
            this.d = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                if (viewGroup.getChildAt(i11) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i11);
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.f22364x) != null && !arrayList.isEmpty()) {
                int size = actionBarPopupWindow$ActionBarPopupWindowLayout.f22364x.size();
                for (int i12 = 0; i12 < size; i12++) {
                    AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindow$ActionBarPopupWindowLayout.f22364x.get(i12);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22364x.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f22905a = animatorSet3;
            if (j10 > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.f22905a.setDuration(j10);
            } else if (this.f22909g) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f22905a.setDuration(this.f22907c);
            } else {
                Property property = View.TRANSLATION_Y;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.v) {
                    f7 = 5.0f;
                } else {
                    f7 = -5.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, property, AndroidUtilities.dp(f7)), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f22905a.setDuration(this.f22907c);
            }
            this.f22905a.addListener(new i1(this, 1));
            if (this.e) {
                this.f22911j.lock();
            }
            this.f22905a.start();
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused2) {
        }
        j();
    }

    @Override
    public void dismiss() {
        d(true);
    }

    public final void e() {
        View contentView = getContentView();
        if (contentView instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) contentView;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                setTouchInterceptor(new fi.o1(1, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
            }
        }
        Field field = f22902l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, f22904n);
            } catch (Exception unused) {
                this.h = null;
            }
        }
    }

    public final void f(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f22910i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f22910i.removeOnScrollChangedListener(this.h);
                }
                this.f22910i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (f22901k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                f22901k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f22901k.invoke(this, Boolean.TRUE);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.f22906b && this.f22905a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22360n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.f22360n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.f22365y;
            float f7 = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i11 = 0;
            for (int i12 = 0; i12 < itemsCount; i12++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i11));
                    i11++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.v) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22362s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22362s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f7 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.f22905a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f7), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.f22905a.setDuration((i11 * 16) + 150);
            this.f22905a.addListener(new i1(this, 0));
            this.f22905a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null && (viewTreeObserver = this.f22910i) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f22910i.removeOnScrollChangedListener(this.h);
            }
            this.f22910i = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            f(view);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void showAtLocation(View view, int i10, int i11, int i12) {
        super.showAtLocation(view, i10, i11, i12);
        j();
    }

    @Override
    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
        f(view);
    }

    @Override
    public final void update(View view, int i10, int i11) {
        super.update(view, i10, i11);
        f(view);
    }
}
