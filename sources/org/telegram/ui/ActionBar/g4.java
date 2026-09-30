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
    public final Context f18933a;
    public final ActionMode.Callback2 f18934b;
    public final Menu f18935c;
    public final Rect d;
    public final Rect e;
    public final Rect f18936f;
    public final int[] f18937g;
    public final int[] h;
    public final int[] f18938i;
    public final Rect f18939j;
    public final Rect f18940k;
    public final Rect f18941l;
    public final View f18942m;
    public final Point f18943n;
    public final int f18944o;
    public final e4 f18945p = new e4(this, 0);
    public final e4 f18946q = new e4(this, 1);
    public final v4 f18947r;
    public final f4 f18948s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f18933a = context;
        this.f18934b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18935c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18934b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18936f = new Rect();
        int[] iArr = new int[2];
        this.f18937g = iArr;
        this.h = new int[2];
        this.f18938i = new int[2];
        this.f18939j = new Rect();
        this.f18940k = new Rect();
        this.f18941l = new Rect();
        this.f18942m = view;
        view.getLocationOnScreen(iArr);
        this.f18944o = AndroidUtilities.dp(20.0f);
        this.f18943n = new Point();
        v4Var.e = menu;
        v4Var.f19897g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18934b.onActionItemClicked(g4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18947r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f18948s = f4Var;
        f4Var.f18896b = false;
        f4Var.f18897c = false;
        f4Var.d = false;
        f4Var.e = true;
        f4Var.f18898f = true;
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
        View view = this.f18942m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18938i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18937g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18933a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18943n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18941l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18936f;
        if (c10) {
            Rect rect5 = this.f18939j;
            if (c(rect2, rect5)) {
                this.f18948s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18944o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f18945p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f18948s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f18899g > 500) {
                        f4Var.f18897c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f18947r.f19895c.set(rect2);
                    v4 v4Var = this.f18947r;
                    if (v4Var.f19894b.f()) {
                        v4Var.c();
                    }
                }
                this.f18948s.a();
                rect4.set(rect2);
            }
        }
        this.f18948s.d = true;
        rect2.setEmpty();
        this.f18948s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18942m;
        int[] iArr = this.f18937g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18938i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18939j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18940k;
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
        v4 v4Var = this.f18947r;
        v4Var.f19893a.removeOnLayoutChangeListener(v4Var.f19901l);
        t4 t4Var = v4Var.f19894b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f19794x.cancel();
            t4Var.f19793w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f18948s;
        f4Var.f18898f = false;
        v4 v4Var2 = f4Var.f18895a;
        v4Var2.f19893a.removeOnLayoutChangeListener(v4Var2.f19901l);
        t4 t4Var2 = v4Var2.f19894b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f19794x.cancel();
            t4Var2.f19793w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f18945p;
        View view = this.f18942m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f18946q);
        this.f18934b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18935c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18933a);
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
        View view = this.f18942m;
        e4 e4Var = this.f18946q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f18948s;
        f4Var.f18896b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18934b.onPrepareActionMode(this, this.f18935c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18934b;
        View view = this.f18942m;
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
        f4 f4Var = this.f18948s;
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
