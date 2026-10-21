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
import org.telegram.ui.Components.iu;
import org.telegram.ui.k51;
import org.telegram.ui.o41;
public final class b6 extends iu {
    public final int f22048c;
    public final Object d;

    public b6(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f22048c = i10;
        this.d = frameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f22048c) {
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
        switch (this.f22048c) {
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
        switch (this.f22048c) {
            case 1:
                if (!ah.x0.f901b) {
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
        switch (this.f22048c) {
            case 0:
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                if (((c6) this.d).f22097s) {
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
        switch (this.f22048c) {
            case 0:
                super.onDraw(canvas);
                ((c6) this.d).getClass();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.f22048c) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ((c6) this.d).i(z10);
                return;
            case 1:
                if (z10) {
                    ((o41) this.d).f39123y.q();
                    AndroidUtilities.runOnUIThread(new k51(this, 0), 200L);
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
        switch (this.f22048c) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                postOnAnimation(new org.telegram.ui.web.z1(this, 17));
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        switch (this.f22048c) {
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
                    if (((c6) this.d).l(arrayList)) {
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
        switch (this.f22048c) {
            case 0:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((c6) this.d).k(this);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                if (motionEvent.getAction() == 1 && ((o41) this.d).f39123y.u()) {
                    AndroidUtilities.runOnUIThread(new k51(this, 1), 200L);
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        switch (this.f22048c) {
            case 0:
                ActionMode startActionMode = super.startActionMode(callback, i10);
                ((c6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback, i10);
        }
    }

    public b6(Context context, org.telegram.ui.ActionBar.d6 d6Var, Drawable drawable) {
        super(context, d6Var);
        this.f22048c = 3;
        this.d = drawable;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        switch (this.f22048c) {
            case 0:
                ActionMode startActionMode = super.startActionMode(callback);
                ((c6) this.d).g(this, startActionMode);
                return startActionMode;
            default:
                return super.startActionMode(callback);
        }
    }
}
