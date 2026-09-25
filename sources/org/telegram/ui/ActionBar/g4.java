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
public final class g4 extends ActionMode {
    public final Context f18917a;
    public final ActionMode.Callback2 f18918b;
    public final Menu f18919c;
    public final Rect d;
    public final Rect e;
    public final Rect f18920f;
    public final int[] f18921g;
    public final int[] h;
    public final int[] f18922i;
    public final Rect f18923j;
    public final Rect f18924k;
    public final Rect f18925l;
    public final View f18926m;
    public final Point f18927n;
    public final int f18928o;
    public final e4 f18929p = new e4(this, 0);
    public final e4 f18930q = new e4(this, 1);
    public final v4 f18931r;
    public final f4 f18932s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f18917a = context;
        this.f18918b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18919c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18918b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18920f = new Rect();
        int[] iArr = new int[2];
        this.f18921g = iArr;
        this.h = new int[2];
        this.f18922i = new int[2];
        this.f18923j = new Rect();
        this.f18924k = new Rect();
        this.f18925l = new Rect();
        this.f18926m = view;
        view.getLocationOnScreen(iArr);
        this.f18928o = AndroidUtilities.dp(20.0f);
        this.f18927n = new Point();
        v4Var.e = menu;
        v4Var.f19881g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18918b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18931r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f18932s = f4Var;
        f4Var.f18880b = false;
        f4Var.f18881c = false;
        f4Var.d = false;
        f4Var.e = true;
        f4Var.f18882f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f18926m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18922i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18921g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18917a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18927n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18925l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18920f;
        if (c10) {
            Rect rect5 = this.f18923j;
            if (c(rect2, rect5)) {
                this.f18932s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18928o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f18929p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f18932s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f18883g > 500) {
                        f4Var.f18881c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f18931r.f19879c.set(rect2);
                    v4 v4Var = this.f18931r;
                    if (v4Var.f19878b.f()) {
                        v4Var.c();
                    }
                }
                this.f18932s.a();
                rect4.set(rect2);
            }
        }
        this.f18932s.d = true;
        rect2.setEmpty();
        this.f18932s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18926m;
        int[] iArr = this.f18921g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18922i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18923j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18924k;
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
        v4 v4Var = this.f18931r;
        v4Var.f19877a.removeOnLayoutChangeListener(v4Var.f19885l);
        t4 t4Var = v4Var.f19878b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f19778x.cancel();
            t4Var.f19777w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f18932s;
        f4Var.f18882f = false;
        v4 v4Var2 = f4Var.f18879a;
        v4Var2.f19877a.removeOnLayoutChangeListener(v4Var2.f19885l);
        t4 t4Var2 = v4Var2.f19878b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f19778x.cancel();
            t4Var2.f19777w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f18929p;
        View view = this.f18926m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f18930q);
        this.f18918b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18919c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18917a);
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
    public final void hide(long j3) {
        if (j3 == -1) {
            j3 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j3);
        View view = this.f18926m;
        e4 e4Var = this.f18930q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f18932s;
        f4Var.f18880b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18918b.onPrepareActionMode(this, this.f18919c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18918b;
        View view = this.f18926m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        f4 f4Var = this.f18932s;
        f4Var.e = z10;
        f4Var.a();
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
