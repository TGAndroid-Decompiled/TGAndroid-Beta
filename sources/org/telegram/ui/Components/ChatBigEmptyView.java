package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public final class ChatBigEmptyView extends LinearLayout {
    public final ArrayList imageViews;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView statusTextView;
    public final ArrayList textViews;

    public ChatBigEmptyView(Activity activity, View view, int i, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.textViews = arrayList;
        this.imageViews = new ArrayList();
        this.resourcesProvider = resourcesProvider;
        int iDp = AndroidUtilities.dp(18.0f);
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackground") : null;
        paint = paint == null ? Theme.getThemePaint("paintChatActionBackground") : paint;
        int i2 = Theme.default_shadow_color;
        setBackground(new Theme.AnonymousClass7(this, view, iDp, paint));
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setOrientation(1);
        if (i == 0) {
            TextView textView = new TextView(activity);
            this.statusTextView = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(Theme.getColor(Theme.key_chat_serviceText, resourcesProvider));
            textView.setGravity(1);
            textView.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView);
            addView(textView, LayoutHelper.createLinear(-2, -2, 49));
        } else if (i == 1) {
            TextView textView2 = new TextView(activity);
            this.statusTextView = textView2;
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_chat_serviceText, resourcesProvider));
            textView2.setGravity(1);
            textView2.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView2);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 49));
        } else {
            RLottieImageView rLottieImageView = new RLottieImageView(activity);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_saved_messages, 120, 120, null);
            rLottieImageView.playAnimation();
            addView(rLottieImageView, LayoutHelper.createLinear(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i == 0) {
            zzkq.m(15.0f, R.string.EncryptedDescriptionTitle, textView3);
        } else if (i == 1) {
            zzkq.m(15.0f, R.string.GroupEmptyTitle2, textView3);
        } else {
            textView3.setText(LocaleController.getString(R.string.ChatYourSelfTitle));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(1);
        }
        textView3.setTextColor(Theme.getColor(Theme.key_chat_serviceText, resourcesProvider));
        arrayList.add(textView3);
        textView3.setMaxWidth(AndroidUtilities.dp(260.0f));
        addView(textView3, LayoutHelper.createLinear(-2, -2, (i != 2 ? LocaleController.isRTL ? 5 : 3 : 1) | 48, 0, 8, 0, i != 2 ? 0 : 8));
        for (int i3 = 0; i3 < 4; i3++) {
            LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 0);
            addView(linearLayoutM, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            int i4 = Theme.key_chat_serviceText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            if (i == 0) {
                imageView.setImageResource(R.drawable.ic_lock_white);
            } else if (i == 2) {
                imageView.setImageResource(R.drawable.list_circle);
            } else {
                imageView.setImageResource(R.drawable.groups_overview_check);
            }
            this.imageViews.add(imageView);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            textView4.setTextColor(Theme.getColor(i4, this.resourcesProvider));
            this.textViews.add(textView4);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            if (i == 0) {
                                textView4.setText(LocaleController.getString(R.string.EncryptedDescription4));
                            } else if (i == 2) {
                                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription4));
                            } else {
                                textView4.setText(LocaleController.getString(R.string.GroupDescription4));
                            }
                        }
                    } else if (i == 0) {
                        textView4.setText(LocaleController.getString(R.string.EncryptedDescription3));
                    } else if (i == 2) {
                        textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription3));
                    } else {
                        textView4.setText(LocaleController.getString(R.string.GroupDescription3));
                    }
                } else if (i == 0) {
                    textView4.setText(LocaleController.getString(R.string.EncryptedDescription2));
                } else if (i == 2) {
                    textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription2));
                } else {
                    textView4.setText(LocaleController.getString(R.string.GroupDescription2));
                }
            } else if (i == 0) {
                textView4.setText(LocaleController.getString(R.string.EncryptedDescription1));
            } else if (i == 2) {
                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription1));
            } else {
                textView4.setText(LocaleController.getString(R.string.GroupDescription1));
            }
            if (LocaleController.isRTL) {
                linearLayoutM.addView(textView4, LayoutHelper.createLinear(-2, -2));
                if (i == 0) {
                    linearLayoutM.addView(imageView, LayoutHelper.createLinear(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i == 2) {
                    linearLayoutM.addView(imageView, LayoutHelper.createLinear(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    linearLayoutM.addView(imageView, LayoutHelper.createLinear(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i != 0 && i == 2) {
                    linearLayoutM.addView(imageView, LayoutHelper.createLinear(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    linearLayoutM.addView(imageView, LayoutHelper.createLinear(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                linearLayoutM.addView(textView4, LayoutHelper.createLinear(-2, -2));
            }
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.statusTextView.setText(charSequence);
    }

    public void setTextColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.textViews;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i3)).setTextColor(i);
            i3++;
        }
        while (true) {
            ArrayList arrayList2 = this.imageViews;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((ImageView) arrayList2.get(i2)).setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_serviceText, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            i2++;
        }
    }
}
