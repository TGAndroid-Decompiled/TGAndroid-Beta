package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.ys;
import org.telegram.ui.e11;
import org.telegram.ui.i01;
public final class z5 extends ys {
    public final int Y1;
    public final Object Z1;

    public z5(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.Y1 = i7;
        this.Z1 = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.Y1) {
            case 3:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.Z1;
                drawable.setBounds(0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public int e() {
        switch (this.Y1) {
            case 0:
                return 3;
            case 1:
            default:
                return super.e();
            case 2:
                return 3;
        }
    }

    @Override
    public void invalidate() {
        switch (this.Y1) {
            case 1:
                if (!ch.e0.f6232b) {
                    super.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        switch (this.Y1) {
            case 0:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((a6) this.Z1).f28891s) {
                    editorInfo.imeOptions &= -1073741825;
                }
                return onCreateInputConnection;
            case 1:
            default:
                return super.onCreateInputConnection(editorInfo);
            case 2:
                InputConnection onCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return onCreateInputConnection2;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.Y1) {
            case 0:
                super.onDraw(canvas);
                ((a6) this.Z1).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z9, int i7, Rect rect) {
        switch (this.Y1) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                ((a6) this.Z1).i(z9);
                return;
            case 1:
                if (z9) {
                    ((i01) this.Z1).F.q();
                    org.telegram.messenger.g0.i3(new e11(this, 0), 200L);
                }
                super.onFocusChanged(z9, i7, rect);
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.Y1) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                postOnAnimation(new sg.t0(this, 3));
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        switch (this.Y1) {
            case 0:
                if (i7 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && org.telegram.messenger.g0.t(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < text.length(); i10++) {
                        char charAt = text.charAt(i10);
                        if (charAt == '\n') {
                            arrayList.add(sb2.toString());
                            sb2.setLength(0);
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        arrayList.add(sb2);
                    }
                    if (((a6) this.Z1).l(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i7);
            default:
                return super.onTextContextMenuItem(i7);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Y1) {
            case 0:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((a6) this.Z1).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                if (motionEvent.getAction() == 1 && ((i01) this.Z1).F.u()) {
                    org.telegram.messenger.g0.i3(new e11(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        switch (this.Y1) {
            case 0:
                ActionMode startActionMode = super.startActionMode(callback, i7);
                ((a6) this.Z1).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i7);
        }
    }

    public z5(Context context, org.telegram.ui.ActionBar.f6 f6Var, Drawable drawable) {
        super(context, f6Var);
        this.Y1 = 3;
        this.Z1 = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.Y1) {
            case 0:
                ActionMode startActionMode = super.startActionMode(callback);
                ((a6) this.Z1).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
