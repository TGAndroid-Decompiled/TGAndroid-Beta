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
public final class m4 extends ActionMode {
    public final Context f22864a;
    public final ActionMode.Callback2 f22865b;
    public final Menu f22866c;
    public final Rect d;
    public final Rect e;
    public final Rect f22867f;
    public final int[] f22868g;
    public final int[] h;
    public final int[] f22869i;
    public final Rect f22870j;
    public final Rect f22871k;
    public final Rect f22872l;
    public final View f22873m;
    public final Point f22874n;
    public final int f22875o;
    public final k4 f22876p = new k4(this, 0);
    public final k4 f22877q = new k4(this, 1);
    public final c5 f22878r;
    public final l4 f22879s;

    public m4(Context context, ActionMode.Callback2 callback2, View view, c5 c5Var) {
        this.f22864a = context;
        this.f22865b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f22866c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                m4 m4Var = m4.this;
                return m4Var.f22865b.onActionItemClicked(m4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f22867f = new Rect();
        int[] iArr = new int[2];
        this.f22868g = iArr;
        this.h = new int[2];
        this.f22869i = new int[2];
        this.f22870j = new Rect();
        this.f22871k = new Rect();
        this.f22872l = new Rect();
        this.f22873m = view;
        view.getLocationOnScreen(iArr);
        this.f22875o = AndroidUtilities.dp(20.0f);
        this.f22874n = new Point();
        c5Var.e = menu;
        c5Var.f22507g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                m4 m4Var = m4.this;
                return m4Var.f22865b.onActionItemClicked(m4Var, menuItem);
            }
        };
        this.f22878r = c5Var;
        l4 l4Var = new l4(c5Var);
        this.f22879s = l4Var;
        l4Var.f22826b = false;
        l4Var.f22827c = false;
        l4Var.d = false;
        l4Var.e = true;
        l4Var.f22828f = true;
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
        View view = this.f22873m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f22869i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f22868g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f22864a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f22874n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f22872l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f22867f;
        if (a2) {
            Rect rect5 = this.f22870j;
            if (a(rect2, rect5)) {
                this.f22879s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f22875o));
                if (!rect2.equals(rect4)) {
                    k4 k4Var = this.f22876p;
                    view.removeCallbacks(k4Var);
                    l4 l4Var = this.f22879s;
                    l4Var.getClass();
                    if (System.currentTimeMillis() - l4Var.f22829g > 500) {
                        l4Var.f22827c = true;
                    }
                    view.postDelayed(k4Var, 50L);
                    this.f22878r.f22505c.set(rect2);
                    c5 c5Var = this.f22878r;
                    if (c5Var.f22504b.f()) {
                        c5Var.c();
                    }
                }
                this.f22879s.a();
                rect4.set(rect2);
            }
        }
        this.f22879s.d = true;
        rect2.setEmpty();
        this.f22879s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f22873m;
        int[] iArr = this.f22868g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f22869i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f22870j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f22871k;
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
        c5 c5Var = this.f22878r;
        c5Var.f22503a.removeOnLayoutChangeListener(c5Var.f22511l);
        a5 a5Var = c5Var.f22504b;
        if (!a5Var.F) {
            a5Var.G = false;
            a5Var.F = true;
            a5Var.f22414x.cancel();
            a5Var.f22413w.start();
            a5Var.D.setEmpty();
        }
        l4 l4Var = this.f22879s;
        l4Var.f22828f = false;
        c5 c5Var2 = l4Var.f22825a;
        c5Var2.f22503a.removeOnLayoutChangeListener(c5Var2.f22511l);
        a5 a5Var2 = c5Var2.f22504b;
        if (!a5Var2.F) {
            a5Var2.G = false;
            a5Var2.F = true;
            a5Var2.f22414x.cancel();
            a5Var2.f22413w.start();
            a5Var2.D.setEmpty();
        }
        k4 k4Var = this.f22876p;
        View view = this.f22873m;
        view.removeCallbacks(k4Var);
        view.removeCallbacks(this.f22877q);
        this.f22865b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f22866c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f22864a);
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
        View view = this.f22873m;
        k4 k4Var = this.f22877q;
        view.removeCallbacks(k4Var);
        if (min <= 0) {
            k4Var.run();
            return;
        }
        l4 l4Var = this.f22879s;
        l4Var.f22826b = true;
        l4Var.a();
        view.postDelayed(k4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f22865b.onPrepareActionMode(this, this.f22866c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f22865b;
        View view = this.f22873m;
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
        l4 l4Var = this.f22879s;
        l4Var.e = z10;
        l4Var.a();
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
