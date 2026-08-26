package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;

public class DatabaseMigrationHint extends FrameLayout {
    LinearLayout container;
    private final int currentAccount;
    TextView description1;
    TextView description2;
    RLottieImageView stickerView;
    TextView title;

    public DatabaseMigrationHint(Context context, int i) {
        super(context);
        this.currentAccount = i;
        LinearLayout linearLayout = new LinearLayout(context);
        this.container = linearLayout;
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.stickerView = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.db_migration_placeholder, 150, 150);
        this.stickerView.getAnimatedDrawable().setAutoRepeat(1);
        this.stickerView.playAnimation();
        this.container.addView(this.stickerView, LayoutHelper.createLinear(150, 150, 1));
        TextView textView = new TextView(context);
        this.title = textView;
        textView.setTextSize(1, 24.0f);
        this.title.setText(LocaleController.getString(R.string.OptimizingTelegram));
        TextView textView2 = this.title;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        this.title.setGravity(1);
        TextView textViewM = zzkc.m(this.container, this.title, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
        this.description1 = textViewM;
        textViewM.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.description1.setTextSize(1, 14.0f);
        this.description1.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
        this.description1.setTextColor(Theme.getColor(null, i2, false));
        this.description1.setGravity(1);
        TextView textViewM2 = zzkc.m(this.container, this.description1, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
        this.description2 = textViewM2;
        textViewM2.setTextSize(1, 14.0f);
        this.description2.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
        this.description2.setTextColor(Theme.getColor(null, i2, false));
        this.description2.setGravity(1);
        this.container.addView(this.description2, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 36, 24, 36, 0));
        addView(this.container, LayoutHelper.createFrame(-1, -2, 16));
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }
}
