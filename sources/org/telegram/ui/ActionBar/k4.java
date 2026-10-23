package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends ActionMode {
    public final Context f21097a;
    public final ActionMode.Callback2 f21098b;
    public final Menu f21099c;
    public final Rect d;
    public final Rect e;
    public final Rect f21100f;
    public final int[] f21101g;
    public final int[] h;
    public final int[] f21102i;
    public final Rect f21103j;
    public final Rect f21104k;
    public final Rect f21105l;
    public final View f21106m;
    public final Point f21107n;
    public final int f21108o;
    public final i4 f21109p = new i4(this, 0);
    public final i4 f21110q = new i4(this, 1);
    public final a5 f21111r;
    public final j4 f21112s;

    public k4(Context context, ActionMode.Callback2 callback2, View view, a5 a5Var) {
        this.f21097a = context;
        this.f21098b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f21099c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                k4 k4Var = k4.this;
                return k4Var.f21098b.onActionItemClicked(k4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f21100f = new Rect();
        int[] iArr = new int[2];
        this.f21101g = iArr;
        this.h = new int[2];
        this.f21102i = new int[2];
        this.f21103j = new Rect();
        this.f21104k = new Rect();
        this.f21105l = new Rect();
        this.f21106m = view;
        view.getLocationOnScreen(iArr);
        this.f21108o = AndroidUtilities.dp(20.0f);
        this.f21107n = new Point();
        a5Var.e = menu;
        a5Var.f20695g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                k4 k4Var = k4.this;
                return k4Var.f21098b.onActionItemClicked(k4Var, menuItem);
            }
        };
        this.f21111r = a5Var;
        j4 j4Var = new j4(a5Var);
        this.f21112s = j4Var;
        j4Var.f20993b = false;
        j4Var.f20994c = false;
        j4Var.d = false;
        j4Var.e = true;
        j4Var.f20995f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f21106m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f21102i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f21101g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f21097a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f21107n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f21105l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f21100f;
        if (a2) {
            Rect rect5 = this.f21103j;
            if (a(rect2, rect5)) {
                this.f21112s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f21108o));
                if (!rect2.equals(rect4)) {
                    i4 i4Var = this.f21109p;
                    view.removeCallbacks(i4Var);
                    j4 j4Var = this.f21112s;
                    j4Var.getClass();
                    if (System.currentTimeMillis() - j4Var.f20996g > 500) {
                        j4Var.f20994c = true;
                    }
                    view.postDelayed(i4Var, 50L);
                    this.f21111r.f20693c.set(rect2);
                    a5 a5Var = this.f21111r;
                    if (a5Var.f20692b.f()) {
                        a5Var.c();
                    }
                }
                this.f21112s.a();
                rect4.set(rect2);
            }
        }
        this.f21112s.d = true;
        rect2.setEmpty();
        this.f21112s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f21106m;
        int[] iArr = this.f21101g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f21102i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f21103j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f21104k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        a5 a5Var = this.f21111r;
        a5Var.f20691a.removeOnLayoutChangeListener(a5Var.f20699l);
        y4 y4Var = a5Var.f20692b;
        if (!y4Var.F) {
            y4Var.G = false;
            y4Var.F = true;
            y4Var.f22010x.cancel();
            y4Var.f22009w.start();
            y4Var.D.setEmpty();
        }
        j4 j4Var = this.f21112s;
        j4Var.f20995f = false;
        a5 a5Var2 = j4Var.f20992a;
        a5Var2.f20691a.removeOnLayoutChangeListener(a5Var2.f20699l);
        y4 y4Var2 = a5Var2.f20692b;
        if (!y4Var2.F) {
            y4Var2.G = false;
            y4Var2.F = true;
            y4Var2.f22010x.cancel();
            y4Var2.f22009w.start();
            y4Var2.D.setEmpty();
        }
        i4 i4Var = this.f21109p;
        View view = this.f21106m;
        view.removeCallbacks(i4Var);
        view.removeCallbacks(this.f21110q);
        this.f21098b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f21099c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f21097a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j10) {
        if (j10 == -1) {
            j10 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j10);
        View view = this.f21106m;
        i4 i4Var = this.f21110q;
        view.removeCallbacks(i4Var);
        if (min <= 0) {
            i4Var.run();
            return;
        }
        j4 j4Var = this.f21112s;
        j4Var.f20993b = true;
        j4Var.a();
        view.postDelayed(i4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f21098b.onPrepareActionMode(this, this.f21099c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f21098b;
        View view = this.f21106m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        j4 j4Var = this.f21112s;
        j4Var.e = z10;
        j4Var.a();
    }

    @Override
    public final void setSubtitle(int i10) {
    }

    @Override
    public final void setTitle(int i10) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }

    @Override
    public final void setCustomView(View view) {
    }
}
