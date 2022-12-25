package org.telegram.p009ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.Bulletin;

@SuppressLint({"ViewConstructor"})
public class SelectSendAsPremiumHintBulletinLayout extends Bulletin.MultiLineLayout {
    public SelectSendAsPremiumHintBulletinLayout(Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        super(context, resourcesProvider);
        this.imageView.setImageDrawable(ContextCompat.getDrawable(context, C1072R.C1073drawable.msg_premium_prolfilestar));
        this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("undo_infoColor"), PorterDuff.Mode.SRC_IN));
        this.textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(C1072R.string.SelectSendAsPeerPremiumHint)));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, resourcesProvider);
        undoButton.setText(LocaleController.getString(C1072R.string.SelectSendAsPeerPremiumOpen));
        undoButton.setUndoAction(runnable);
        setButton(undoButton);
    }
}
