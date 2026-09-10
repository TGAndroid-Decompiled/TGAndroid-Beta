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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fu;
import org.telegram.ui.c61;
import org.telegram.ui.y61;
public final class d6 extends fu {
    public final int f19000c;
    public final Object d;

    public d6(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.f19000c = i10;
        this.d = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f19000c) {
            case 3:
                super.dispatchDraw(canvas);
                Drawable drawable = (Drawable) this.d;
                drawable.setBounds(0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(28.0f));
                drawable.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public int emojiCacheType() {
        switch (this.f19000c) {
            case 0:
                return 3;
            case 1:
            default:
                return super.emojiCacheType();
            case 2:
                return 3;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f19000c) {
            case 1:
                if (!yg.f0.f46996b) {
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
        switch (this.f19000c) {
            case 0:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((e6) this.d).f19079s) {
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
        switch (this.f19000c) {
            case 0:
                super.onDraw(canvas);
                ((e6) this.d).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.f19000c) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ((e6) this.d).i(z10);
                return;
            case 1:
                if (z10) {
                    ((c61) this.d).f30821y.q();
                    AndroidUtilities.runOnUIThread(new y61(this, 0), 200L);
                }
                super.onFocusChanged(z10, i10, rect);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f19000c) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                postOnAnimation(new org.telegram.ui.Components.voip.x(this, 26));
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        switch (this.f19000c) {
            case 0:
                if (i10 == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && AndroidUtilities.charSequenceIndexOf(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < text.length(); i11++) {
                        char charAt = text.charAt(i11);
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
                    if (((e6) this.d).l(arrayList)) {
                        return true;
                    }
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f19000c) {
            case 0:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((e6) this.d).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                if (motionEvent.getAction() == 1 && ((c61) this.d).f30821y.u()) {
                    AndroidUtilities.runOnUIThread(new y61(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        switch (this.f19000c) {
            case 0:
                ActionMode startActionMode = super.startActionMode(callback, i10);
                ((e6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i10);
        }
    }

    public d6(Context context, org.telegram.ui.ActionBar.f6 f6Var, Drawable drawable) {
        super(context, f6Var);
        this.f19000c = 3;
        this.d = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f19000c) {
            case 0:
                ActionMode startActionMode = super.startActionMode(callback);
                ((e6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
