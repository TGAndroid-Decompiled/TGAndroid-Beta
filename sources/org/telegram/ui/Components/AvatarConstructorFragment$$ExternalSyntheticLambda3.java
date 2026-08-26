package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AvatarConstructorFragment$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, ColorPicker.ColorPickerDelegate {
    public final int $r8$classId;
    public final AvatarConstructorFragment f$0;

    public AvatarConstructorFragment$$ExternalSyntheticLambda3(AvatarConstructorFragment avatarConstructorFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = avatarConstructorFragment;
    }

    @Override
    public void deleteTheme() {
    }

    @Override
    public int getDefaultColor(int i) {
        return 0;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBackPressed$8$1(alertDialog, i);
                break;
            default:
                this.f$0.lambda$discardEditor$2(alertDialog, i);
                break;
        }
    }

    @Override
    public void openThemeCreate(boolean z) {
    }

    @Override
    public void setColor(int i, int i2, boolean z) {
        AvatarConstructorFragment avatarConstructorFragment = this.f$0;
        if (i2 == 0) {
            AvatarConstructorFragment.BackgroundGradient backgroundGradient = avatarConstructorFragment.colorPickerGradient;
            int i3 = backgroundGradient.color1;
            if (i3 != i && (i3 == 0 || i == 0)) {
                AvatarConstructorFragment.BackgroundGradient backgroundGradientCopy = backgroundGradient.copy();
                avatarConstructorFragment.colorPickerGradient = backgroundGradientCopy;
                avatarConstructorFragment.previewView.setGradient(backgroundGradientCopy, true);
                avatarConstructorFragment.updateButton$7();
            }
            avatarConstructorFragment.colorPickerGradient.color1 = i;
        } else if (i2 == 1) {
            AvatarConstructorFragment.BackgroundGradient backgroundGradient2 = avatarConstructorFragment.colorPickerGradient;
            int i4 = backgroundGradient2.color2;
            if (i4 != i && (i4 == 0 || i == 0)) {
                AvatarConstructorFragment.BackgroundGradient backgroundGradientCopy2 = backgroundGradient2.copy();
                avatarConstructorFragment.colorPickerGradient = backgroundGradientCopy2;
                avatarConstructorFragment.previewView.setGradient(backgroundGradientCopy2, true);
                avatarConstructorFragment.updateButton$7();
            }
            avatarConstructorFragment.colorPickerGradient.color2 = i;
        } else if (i2 == 2) {
            AvatarConstructorFragment.BackgroundGradient backgroundGradient3 = avatarConstructorFragment.colorPickerGradient;
            int i5 = backgroundGradient3.color3;
            if (i5 != i && (i5 == 0 || i == 0)) {
                AvatarConstructorFragment.BackgroundGradient backgroundGradientCopy3 = backgroundGradient3.copy();
                avatarConstructorFragment.colorPickerGradient = backgroundGradientCopy3;
                avatarConstructorFragment.previewView.setGradient(backgroundGradientCopy3, true);
                avatarConstructorFragment.updateButton$7();
            }
            avatarConstructorFragment.colorPickerGradient.color3 = i;
        } else if (i2 == 3) {
            AvatarConstructorFragment.BackgroundGradient backgroundGradient4 = avatarConstructorFragment.colorPickerGradient;
            int i6 = backgroundGradient4.color4;
            if (i6 != i && (i6 == 0 || i == 0)) {
                AvatarConstructorFragment.BackgroundGradient backgroundGradientCopy4 = backgroundGradient4.copy();
                avatarConstructorFragment.colorPickerGradient = backgroundGradientCopy4;
                avatarConstructorFragment.previewView.setGradient(backgroundGradientCopy4, true);
                avatarConstructorFragment.updateButton$7();
            }
            avatarConstructorFragment.colorPickerGradient.color4 = i;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            avatarConstructorFragment.getClass();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        avatarConstructorFragment.previewView.invalidate();
    }
}
