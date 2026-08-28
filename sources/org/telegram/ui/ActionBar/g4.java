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
    public final Context f23425a;
    public final ActionMode.Callback2 f23426b;
    public final Menu f23427c;
    public final Rect d;
    public final Rect f23428e;
    public final Rect f23429f;
    public final int[] f23430g;
    public final int[] h;
    public final int[] f23431i;
    public final Rect f23432j;
    public final Rect f23433k;
    public final Rect f23434l;
    public final View f23435m;
    public final Point f23436n;
    public final int f23437o;
    public final e4 f23438p = new e4(this, 0);
    public final e4 f23439q = new e4(this, 1);
    public final v4 f23440r;
    public final f4 f23441s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f23425a = context;
        this.f23426b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f23427c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f23426b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.f23428e = new Rect();
        this.f23429f = new Rect();
        int[] iArr = new int[2];
        this.f23430g = iArr;
        this.h = new int[2];
        this.f23431i = new int[2];
        this.f23432j = new Rect();
        this.f23433k = new Rect();
        this.f23434l = new Rect();
        this.f23435m = view;
        view.getLocationOnScreen(iArr);
        this.f23437o = AndroidUtilities.dp(20.0f);
        this.f23436n = new Point();
        v4Var.f23876e = menu;
        v4Var.f23878g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f23426b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f23440r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f23441s = f4Var;
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
        Rect rect2 = this.f23428e;
        rect2.set(rect);
        View view = this.f23435m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f23431i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f23430g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f23425a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f23436n;
        defaultDisplay.getRealSize(point);
        int i9 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f23434l;
        rect3.set(0, 0, i9, i10);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f23429f;
        if (c10) {
            Rect rect5 = this.f23432j;
            if (c(rect2, rect5)) {
                this.f23441s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f23437o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f23438p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f23441s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f22938g > 500) {
                        f4Var.f22935c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f23440r.f23875c.set(rect2);
                    v4 v4Var = this.f23440r;
                    if (v4Var.f23874b.f()) {
                        v4Var.c();
                    }
                }
                this.f23441s.a();
                rect4.set(rect2);
            }
        }
        this.f23441s.d = true;
        rect2.setEmpty();
        this.f23441s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f23435m;
        int[] iArr = this.f23430g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f23431i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f23432j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f23433k;
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
        v4 v4Var = this.f23440r;
        v4Var.f23873a.removeOnLayoutChangeListener(v4Var.f23882l);
        t4 t4Var = v4Var.f23874b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f23790x.cancel();
            t4Var.f23789w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f23441s;
        f4Var.f22937f = false;
        v4 v4Var2 = f4Var.f22933a;
        v4Var2.f23873a.removeOnLayoutChangeListener(v4Var2.f23882l);
        t4 t4Var2 = v4Var2.f23874b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f23790x.cancel();
            t4Var2.f23789w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f23438p;
        View view = this.f23435m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f23439q);
        this.f23426b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f23427c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f23425a);
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
        View view = this.f23435m;
        e4 e4Var = this.f23439q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f23441s;
        f4Var.f22934b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f23426b.onPrepareActionMode(this, this.f23427c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f23426b;
        View view = this.f23435m;
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
        f4 f4Var = this.f23441s;
        f4Var.f22936e = z10;
        f4Var.a();
    }

    @Override
    public final void setSubtitle(int i9) {
    }

    @Override
    public final void setTitle(int i9) {
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
