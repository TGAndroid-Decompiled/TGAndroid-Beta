package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public class ChatBigEmptyView extends LinearLayout {
    private ArrayList<ImageView> imageViews;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView statusTextView;
    private ArrayList<TextView> textViews;

    public ChatBigEmptyView(Context context, View view, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i2;
        this.textViews = new ArrayList<>();
        this.imageViews = new ArrayList<>();
        this.resourcesProvider = resourcesProvider;
        setBackground(Theme.createServiceDrawable(AndroidUtilities.dp(18.0f), this, view, getThemedPaint("paintChatActionBackground")));
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setOrientation(1);
        if (i == 0) {
            TextView textView = new TextView(context);
            this.statusTextView = textView;
            textView.setTextSize(1, 15.0f);
            this.statusTextView.setTextColor(getThemedColor(Theme.key_chat_serviceText));
            this.statusTextView.setGravity(1);
            this.statusTextView.setMaxWidth(AndroidUtilities.dp(210.0f));
            this.textViews.add(this.statusTextView);
            addView(this.statusTextView, LayoutHelper.createLinear(-2, -2, 49));
        } else if (i == 1) {
            TextView textView2 = new TextView(context);
            this.statusTextView = textView2;
            textView2.setTextSize(1, 15.0f);
            this.statusTextView.setTextColor(getThemedColor(Theme.key_chat_serviceText));
            this.statusTextView.setGravity(1);
            this.statusTextView.setMaxWidth(AndroidUtilities.dp(210.0f));
            this.textViews.add(this.statusTextView);
            addView(this.statusTextView, LayoutHelper.createLinear(-2, -2, 49));
        } else {
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_saved_messages, 120, 120);
            rLottieImageView.playAnimation();
            addView(rLottieImageView, LayoutHelper.createLinear(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(context);
        if (i == 0) {
            textView3.setText(LocaleController.getString(R.string.EncryptedDescriptionTitle));
            textView3.setTextSize(1, 15.0f);
        } else if (i == 1) {
            textView3.setText(LocaleController.getString(R.string.GroupEmptyTitle2));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(LocaleController.getString(R.string.ChatYourSelfTitle));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(1);
        }
        textView3.setTextColor(getThemedColor(Theme.key_chat_serviceText));
        this.textViews.add(textView3);
        textView3.setMaxWidth(AndroidUtilities.dp(260.0f));
        if (i != 2) {
            i2 = LocaleController.isRTL ? 5 : 3;
        } else {
            i2 = 1;
        }
        int i3 = i2 | 48;
        int i4 = 0;
        addView(textView3, LayoutHelper.createLinear(-2, -2, i3, 0, 8, 0, i != 2 ? 0 : 8));
        int i5 = 0;
        while (i5 < 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(i4);
            addView(linearLayout, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i6 = Theme.key_chat_serviceText;
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i6), PorterDuff.Mode.MULTIPLY));
            if (i == 0) {
                imageView.setImageResource(R.drawable.ic_lock_white);
            } else if (i == 2) {
                imageView.setImageResource(R.drawable.list_circle);
            } else {
                imageView.setImageResource(R.drawable.groups_overview_check);
            }
            this.imageViews.add(imageView);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 15.0f);
            textView4.setTextColor(getThemedColor(i6));
            this.textViews.add(textView4);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
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
                linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2));
                if (i == 0) {
                    linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 8.0f, 3.0f, 0.0f, 0.0f));
                } else if (i == 2) {
                    linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 8.0f, 7.0f, 0.0f, 0.0f));
                } else {
                    linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 8.0f, 3.0f, 0.0f, 0.0f));
                }
            } else {
                if (i == 0) {
                    linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 4.0f, 8.0f, 0.0f));
                } else if (i == 2) {
                    linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 8.0f, 8.0f, 0.0f));
                } else {
                    linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 4.0f, 8.0f, 0.0f));
                }
                linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2));
            }
            i5++;
            i4 = 0;
        }
    }

    public void setTextColor(int i) {
        for (int i2 = 0; i2 < this.textViews.size(); i2++) {
            this.textViews.get(i2).setTextColor(i);
        }
        for (int i3 = 0; i3 < this.imageViews.size(); i3++) {
            this.imageViews.get(i3).setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_serviceText), PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.statusTextView.setText(charSequence);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }
}
