package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;

public final class AvatarConstructorFragment$$ExternalSyntheticLambda4 implements AlertDialog.OnButtonClickListener, ColorPicker.ColorPickerDelegate {
    public final int $r8$classId;
    public final AvatarConstructorFragment f$0;

    public AvatarConstructorFragment$$ExternalSyntheticLambda4(AvatarConstructorFragment avatarConstructorFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = avatarConstructorFragment;
    }

    @Override
    public void deleteTheme() {
        ColorPicker.ColorPickerDelegate.CC.$default$deleteTheme(this);
    }

    @Override
    public int getDefaultColor(int i) {
        return ColorPicker.ColorPickerDelegate.CC.$default$getDefaultColor(this, i);
    }

    @Override
    public boolean hasChanges() {
        return ColorPicker.ColorPickerDelegate.CC.$default$hasChanges(this);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBackPressed$8(alertDialog, i);
                break;
            default:
                this.f$0.lambda$discardEditor$2(alertDialog, i);
                break;
        }
    }

    @Override
    public void openThemeCreate(boolean z) {
        ColorPicker.ColorPickerDelegate.CC.$default$openThemeCreate(this, z);
    }

    @Override
    public void rotateColors() {
        ColorPicker.ColorPickerDelegate.CC.$default$rotateColors(this);
    }

    @Override
    public void setColor(int i, int i2, boolean z) {
        this.f$0.lambda$showColorPicker$5(i, i2, z);
    }
}
