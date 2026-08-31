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
    public final Context f21581a;
    public final ActionMode.Callback2 f21582b;
    public final Menu f21583c;
    public final Rect d;
    public final Rect f21584e;
    public final Rect f21585f;
    public final int[] f21586g;
    public final int[] h;
    public final int[] f21587i;
    public final Rect f21588j;
    public final Rect f21589k;
    public final Rect f21590l;
    public final View f21591m;
    public final Point f21592n;
    public final int f21593o;
    public final i4 f21594p = new i4(this, 0);
    public final i4 f21595q = new i4(this, 1);
    public final z4 f21596r;
    public final j4 f21597s;

    public k4(Context context, ActionMode.Callback2 callback2, View view, z4 z4Var) {
        this.f21581a = context;
        this.f21582b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f21583c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f21582b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f21584e = new Rect();
        this.f21585f = new Rect();
        int[] iArr = new int[2];
        this.f21586g = iArr;
        this.h = new int[2];
        this.f21587i = new int[2];
        this.f21588j = new Rect();
        this.f21589k = new Rect();
        this.f21590l = new Rect();
        this.f21591m = view;
        view.getLocationOnScreen(iArr);
        this.f21593o = AndroidUtilities.dp(20.0f);
        this.f21592n = new Point();
        z4Var.f22493e = menu;
        z4Var.f22495g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f21582b.onActionItemClicked(k4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f21596r = z4Var;
        j4 j4Var = new j4(z4Var);
        this.f21597s = j4Var;
        j4Var.f21496b = false;
        j4Var.f21497c = false;
        j4Var.d = false;
        j4Var.f21498e = true;
        j4Var.f21499f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f21584e;
        rect2.set(rect);
        View view = this.f21591m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f21587i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f21586g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f21581a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f21592n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f21590l;
        rect3.set(0, 0, i10, i11);
        boolean c3 = c(rect2, rect3);
        Rect rect4 = this.f21585f;
        if (c3) {
            Rect rect5 = this.f21588j;
            if (c(rect2, rect5)) {
                this.f21597s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f21593o));
                if (!rect2.equals(rect4)) {
                    i4 i4Var = this.f21594p;
                    view.removeCallbacks(i4Var);
                    j4 j4Var = this.f21597s;
                    j4Var.getClass();
                    if (System.currentTimeMillis() - j4Var.f21500g > 500) {
                        j4Var.f21497c = true;
                    }
                    view.postDelayed(i4Var, 50L);
                    this.f21596r.f22492c.set(rect2);
                    z4 z4Var = this.f21596r;
                    if (z4Var.f22491b.f()) {
                        z4Var.c();
                    }
                }
                this.f21597s.a();
                rect4.set(rect2);
            }
        }
        this.f21597s.d = true;
        rect2.setEmpty();
        this.f21597s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f21591m;
        int[] iArr = this.f21586g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f21587i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f21588j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f21589k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        z4 z4Var = this.f21596r;
        z4Var.f22490a.removeOnLayoutChangeListener(z4Var.f22499l);
        x4 x4Var = z4Var.f22491b;
        if (!x4Var.F) {
            x4Var.G = false;
            x4Var.F = true;
            x4Var.f22443x.cancel();
            x4Var.f22442w.start();
            x4Var.D.setEmpty();
        }
        j4 j4Var = this.f21597s;
        j4Var.f21499f = false;
        z4 z4Var2 = j4Var.f21495a;
        z4Var2.f22490a.removeOnLayoutChangeListener(z4Var2.f22499l);
        x4 x4Var2 = z4Var2.f22491b;
        if (!x4Var2.F) {
            x4Var2.G = false;
            x4Var2.F = true;
            x4Var2.f22443x.cancel();
            x4Var2.f22442w.start();
            x4Var2.D.setEmpty();
        }
        i4 i4Var = this.f21594p;
        View view = this.f21591m;
        view.removeCallbacks(i4Var);
        view.removeCallbacks(this.f21595q);
        this.f21582b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f21583c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f21581a);
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
        View view = this.f21591m;
        i4 i4Var = this.f21595q;
        view.removeCallbacks(i4Var);
        if (min <= 0) {
            i4Var.run();
            return;
        }
        j4 j4Var = this.f21597s;
        j4Var.f21496b = true;
        j4Var.a();
        view.postDelayed(i4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f21582b.onPrepareActionMode(this, this.f21583c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f21582b;
        View view = this.f21591m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z4) {
        j4 j4Var = this.f21597s;
        j4Var.f21498e = z4;
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
