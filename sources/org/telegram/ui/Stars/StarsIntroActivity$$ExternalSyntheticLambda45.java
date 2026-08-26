package org.telegram.ui.Stars;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StarsIntroActivity$$ExternalSyntheticLambda45 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final boolean[] f$0;
    public final Utilities.Callback2 f$1;
    public final EditTextBoldCursor f$2;
    public final ButtonWithCounterView f$3;
    public final BottomSheet[] f$4;

    public StarsIntroActivity$$ExternalSyntheticLambda45(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr) {
        this.f$0 = zArr;
        this.f$1 = callback2;
        this.f$2 = editTextBoldCursor;
        this.f$3 = buttonWithCounterView;
        this.f$4 = bottomSheetArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                boolean[] zArr = this.f$0;
                if (!zArr[0]) {
                    Utilities.Callback2 callback2 = this.f$1;
                    EditTextBoldCursor editTextBoldCursor = this.f$2;
                    BottomSheet[] bottomSheetArr = this.f$4;
                    String string = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.f$3.setLoading(true);
                    callback2.run(Long.valueOf(TextUtils.isEmpty(string) ? 0L : Long.parseLong(string)), new StarsIntroActivity$$ExternalSyntheticLambda48(editTextBoldCursor, bottomSheetArr, 1));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.f$0;
                if (!zArr2[0]) {
                    Utilities.Callback2 callback3 = this.f$1;
                    EditTextBoldCursor editTextBoldCursor2 = this.f$2;
                    BottomSheet[] bottomSheetArr2 = this.f$4;
                    zArr2[0] = true;
                    this.f$3.setLoading(true);
                    callback3.run(0L, new StarGiftSheet$$ExternalSyntheticLambda66(zArr2, editTextBoldCursor2, bottomSheetArr2, 25));
                    break;
                }
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda45(boolean[] zArr, Utilities.Callback2 callback2, ButtonWithCounterView buttonWithCounterView, EditTextBoldCursor editTextBoldCursor, BottomSheet[] bottomSheetArr) {
        this.f$0 = zArr;
        this.f$1 = callback2;
        this.f$3 = buttonWithCounterView;
        this.f$2 = editTextBoldCursor;
        this.f$4 = bottomSheetArr;
    }
}
