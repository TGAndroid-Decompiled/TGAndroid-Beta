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
    public static Method f23705k;
    public static final Field f23706l;
    public static final DecelerateInterpolator f23707m = new DecelerateInterpolator();
    public static final h1 f23708n;
    public AnimatorSet f23709a;
    public boolean f23710b;
    public int f23711c;
    public boolean d;
    public boolean f23712e;
    public long f23713f;
    public boolean f23714g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver f23715i;
    public AnimationNotificationsLocker f23716j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f23706l = field;
        f23708n = new h1(0);
    }

    public o1(View view, int i10, int i11) {
        super(view, i10, i11);
        this.f23710b = true;
        this.f23711c = 150;
        this.f23713f = -1L;
        this.f23716j = new AnimationNotificationsLocker();
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22708n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f9 = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.f22713y;
        hashMap.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < itemsCount; i11++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
            if (!(childAt instanceof l1)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i10));
                    i10++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.v) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22710s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f22710s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f9 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x0(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22703a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22704b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f9), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255), ofFloat);
        animatorSet.setDuration((i10 * 16) + 150);
        animatorSet.addListener(new i(actionBarPopupWindow$ActionBarPopupWindowLayout, 1));
        animatorSet.start();
    }

    public final void b() {
        c(0.2f);
    }

    public final void c(float f9) {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f9;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public void d(boolean z10) {
        float f9;
        ArrayList arrayList;
        long j10 = this.f23713f;
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
        AnimatorSet animatorSet = this.f23709a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (!z10 || !this.d) {
                animatorSet.cancel();
                this.f23709a = null;
            } else {
                return;
            }
        }
        this.d = false;
        if (this.f23710b && z10) {
            this.d = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                if (viewGroup.getChildAt(i11) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i11);
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.f22712x) != null && !arrayList.isEmpty()) {
                int size = actionBarPopupWindow$ActionBarPopupWindowLayout.f22712x.size();
                for (int i12 = 0; i12 < size; i12++) {
                    AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindow$ActionBarPopupWindowLayout.f22712x.get(i12);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22712x.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f23709a = animatorSet3;
            if (j10 > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.f23709a.setDuration(j10);
            } else if (this.f23714g) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f23709a.setDuration(this.f23711c);
            } else {
                Property property = View.TRANSLATION_Y;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.v) {
                    f9 = 5.0f;
                } else {
                    f9 = -5.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, property, AndroidUtilities.dp(f9)), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f23709a.setDuration(this.f23711c);
            }
            this.f23709a.addListener(new i1(this, 1));
            if (this.f23712e) {
                this.f23716j.lock();
            }
            this.f23709a.start();
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
                setTouchInterceptor(new nh.o1(1, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
            }
        }
        Field field = f23706l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, f23708n);
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
            ViewTreeObserver viewTreeObserver2 = this.f23715i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f23715i.removeOnScrollChangedListener(this.h);
                }
                this.f23715i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (f23705k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                f23705k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f23705k.invoke(this, Boolean.TRUE);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.f23710b && this.f23709a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22708n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.f22708n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.f22713y;
            float f9 = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i11 = 0;
            for (int i12 = 0; i12 < itemsCount; i12++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i11));
                    i11++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.v) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22710s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22710s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f9 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.f23709a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f9), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.f23709a.setDuration((i11 * 16) + 150);
            this.f23709a.addListener(new i1(this, 0));
            this.f23709a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null && (viewTreeObserver = this.f23715i) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f23715i.removeOnScrollChangedListener(this.h);
            }
            this.f23715i = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            f(view);
        } catch (Exception e10) {
            FileLog.e(e10);
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
