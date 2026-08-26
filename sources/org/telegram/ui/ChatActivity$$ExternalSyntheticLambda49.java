package org.telegram.ui;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public final class ChatActivity$$ExternalSyntheticLambda49 implements SlideChooseView.Callback, AlertDialog.OnButtonClickListener, Utilities.Callback2Return, RecyclerListView.OnInterceptTouchListener, ViewPositionWatcher.OnChangedListener, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter, NumberPicker.Formatter, GenericProvider, FlagSecureReason.FlagSecureCondition {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda49(int i) {
        this.$r8$classId = i;
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 23:
                return GroupCallActivity.lambda$new$48(i);
            case 24:
                return GroupCallActivity.lambda$new$49(i);
            default:
                return PasscodeActivity.lambda$createView$3(i);
        }
    }

    @Override
    public float get(Object obj) {
        CodeNumberField codeNumberField = (CodeNumberField) obj;
        switch (this.$r8$classId) {
            case 12:
                return codeNumberField.focusedProgress;
            case 13:
            case 15:
            default:
                return codeNumberField.successScaleProgress;
            case 14:
                return codeNumberField.errorProgress;
            case 16:
                return codeNumberField.successProgress;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                alertDialog.dismiss();
                break;
            case 3:
                alertDialog.dismiss();
                break;
            case 5:
                alertDialog.dismiss();
                break;
            case 6:
                alertDialog.dismiss();
                break;
            case 7:
                alertDialog.dismiss();
                break;
            case 8:
                alertDialog.dismiss();
                break;
            case 10:
                alertDialog.dismiss();
                break;
            case 20:
                alertDialog.dismiss();
                break;
            case 21:
                DialogsActivity.lambda$onResume$84(alertDialog, i);
                break;
            default:
                DialogsActivity.lambda$onResume$86(alertDialog, i);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return ChatActivity.lambda$showChatThemeBottomSheet$397(motionEvent);
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 1:
                CacheControlActivity.ListAdapter.lambda$onCreateViewHolder$0(i);
                break;
            default:
                ProxyListActivity.ListAdapter.lambda$onBindViewHolder$0(i);
                break;
        }
    }

    @Override
    public void onPositionChanged(View view, RectF rectF) {
        view.invalidate();
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }

    @Override
    public Object provide(Object obj) {
        Void r2 = (Void) obj;
        switch (this.$r8$classId) {
            case 25:
                return IntroActivity.EGLThread.lambda$new$0(r2);
            case 26:
                return IntroActivity.EGLThread.lambda$initGL$1(r2);
            default:
                return LaunchActivity.lambda$switchToAccount$5(r2);
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return ChatUsersActivity.ListAdapter.lambda$onBindViewHolder$3((Integer) obj, (Integer) obj2);
    }

    @Override
    public void set(Object obj, float f) {
        CodeNumberField codeNumberField = (CodeNumberField) obj;
        switch (this.$r8$classId) {
            case 13:
                CodeNumberField.lambda$static$1(codeNumberField, f);
                break;
            case 14:
            case 16:
            default:
                CodeNumberField.lambda$static$7(codeNumberField, f);
                break;
            case 15:
                CodeNumberField.lambda$static$3(codeNumberField, f);
                break;
            case 17:
                CodeNumberField.lambda$static$5(codeNumberField, f);
                break;
        }
    }

    @Override
    public boolean run() {
        return LaunchActivity.lambda$onCreate$0();
    }
}
