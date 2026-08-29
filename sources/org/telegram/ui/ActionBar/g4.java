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
    public final Context f22985a;
    public final ActionMode.Callback2 f22986b;
    public final Menu f22987c;
    public final Rect d;
    public final Rect f22988e;
    public final Rect f22989f;
    public final int[] f22990g;
    public final int[] h;
    public final int[] f22991i;
    public final Rect f22992j;
    public final Rect f22993k;
    public final Rect f22994l;
    public final View f22995m;
    public final Point f22996n;
    public final int f22997o;
    public final e4 f22998p = new e4(this, 0);
    public final e4 f22999q = new e4(this, 1);
    public final v4 f23000r;
    public final f4 f23001s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f22985a = context;
        this.f22986b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f22987c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f22986b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f22988e = new Rect();
        this.f22989f = new Rect();
        int[] iArr = new int[2];
        this.f22990g = iArr;
        this.h = new int[2];
        this.f22991i = new int[2];
        this.f22992j = new Rect();
        this.f22993k = new Rect();
        this.f22994l = new Rect();
        this.f22995m = view;
        view.getLocationOnScreen(iArr);
        this.f22997o = AndroidUtilities.dp(20.0f);
        this.f22996n = new Point();
        v4Var.f23896e = menu;
        v4Var.f23898g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f22986b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f23000r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f23001s = f4Var;
        f4Var.f22934b = false;
        f4Var.f22935c = false;
        f4Var.d = false;
        f4Var.f22936e = true;
        f4Var.f22937f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f22988e;
        rect2.set(rect);
        View view = this.f22995m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f22991i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f22990g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f22985a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f22996n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f22994l;
        rect3.set(0, 0, i10, i11);
        boolean c3 = c(rect2, rect3);
        Rect rect4 = this.f22989f;
        if (c3) {
            Rect rect5 = this.f22992j;
            if (c(rect2, rect5)) {
                this.f23001s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f22997o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f22998p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f23001s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f22938g > 500) {
                        f4Var.f22935c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f23000r.f23895c.set(rect2);
                    v4 v4Var = this.f23000r;
                    if (v4Var.f23894b.f()) {
                        v4Var.c();
                    }
                }
                this.f23001s.a();
                rect4.set(rect2);
            }
        }
        this.f23001s.d = true;
        rect2.setEmpty();
        this.f23001s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f22995m;
        int[] iArr = this.f22990g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f22991i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f22992j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f22993k;
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
        v4 v4Var = this.f23000r;
        v4Var.f23893a.removeOnLayoutChangeListener(v4Var.f23902l);
        t4 t4Var = v4Var.f23894b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f23812x.cancel();
            t4Var.f23811w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f23001s;
        f4Var.f22937f = false;
        v4 v4Var2 = f4Var.f22933a;
        v4Var2.f23893a.removeOnLayoutChangeListener(v4Var2.f23902l);
        t4 t4Var2 = v4Var2.f23894b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f23812x.cancel();
            t4Var2.f23811w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f22998p;
        View view = this.f22995m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f22999q);
        this.f22986b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f22987c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f22985a);
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
        View view = this.f22995m;
        e4 e4Var = this.f22999q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f23001s;
        f4Var.f22934b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f22986b.onPrepareActionMode(this, this.f22987c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f22986b;
        View view = this.f22995m;
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
        f4 f4Var = this.f23001s;
        f4Var.f22936e = z10;
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
