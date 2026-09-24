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
    public final Context f18902a;
    public final ActionMode.Callback2 f18903b;
    public final Menu f18904c;
    public final Rect d;
    public final Rect e;
    public final Rect f18905f;
    public final int[] f18906g;
    public final int[] h;
    public final int[] f18907i;
    public final Rect f18908j;
    public final Rect f18909k;
    public final Rect f18910l;
    public final View f18911m;
    public final Point f18912n;
    public final int f18913o;
    public final e4 f18914p = new e4(this, 0);
    public final e4 f18915q = new e4(this, 1);
    public final v4 f18916r;
    public final f4 f18917s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f18902a = context;
        this.f18903b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18904c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18903b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18905f = new Rect();
        int[] iArr = new int[2];
        this.f18906g = iArr;
        this.h = new int[2];
        this.f18907i = new int[2];
        this.f18908j = new Rect();
        this.f18909k = new Rect();
        this.f18910l = new Rect();
        this.f18911m = view;
        view.getLocationOnScreen(iArr);
        this.f18913o = AndroidUtilities.dp(20.0f);
        this.f18912n = new Point();
        v4Var.e = menu;
        v4Var.f19866g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18903b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18916r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f18917s = f4Var;
        f4Var.f18865b = false;
        f4Var.f18866c = false;
        f4Var.d = false;
        f4Var.e = true;
        f4Var.f18867f = true;
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
        View view = this.f18911m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18907i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18906g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18902a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18912n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18910l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18905f;
        if (c10) {
            Rect rect5 = this.f18908j;
            if (c(rect2, rect5)) {
                this.f18917s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18913o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f18914p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f18917s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f18868g > 500) {
                        f4Var.f18866c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f18916r.f19864c.set(rect2);
                    v4 v4Var = this.f18916r;
                    if (v4Var.f19863b.f()) {
                        v4Var.c();
                    }
                }
                this.f18917s.a();
                rect4.set(rect2);
            }
        }
        this.f18917s.d = true;
        rect2.setEmpty();
        this.f18917s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18911m;
        int[] iArr = this.f18906g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18907i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18908j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18909k;
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
        v4 v4Var = this.f18916r;
        v4Var.f19862a.removeOnLayoutChangeListener(v4Var.f19870l);
        t4 t4Var = v4Var.f19863b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f19763x.cancel();
            t4Var.f19762w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f18917s;
        f4Var.f18867f = false;
        v4 v4Var2 = f4Var.f18864a;
        v4Var2.f19862a.removeOnLayoutChangeListener(v4Var2.f19870l);
        t4 t4Var2 = v4Var2.f19863b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f19763x.cancel();
            t4Var2.f19762w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f18914p;
        View view = this.f18911m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f18915q);
        this.f18903b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18904c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18902a);
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
        View view = this.f18911m;
        e4 e4Var = this.f18915q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f18917s;
        f4Var.f18865b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18903b.onPrepareActionMode(this, this.f18904c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18903b;
        View view = this.f18911m;
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
        f4 f4Var = this.f18917s;
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
