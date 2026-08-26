package org.telegram.ui.Stories.recorder;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.LaunchActivity;

public final class PreviewView$$ExternalSyntheticLambda8 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public PreviewView$$ExternalSyntheticLambda8(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void run(Object obj) {
        String string;
        int i = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) obj;
                PreviewView previewView = (PreviewView) obj2;
                StoryEntry storyEntry = previewView.entry;
                int i2 = iArr[0];
                previewView.gradientTop = i2;
                storyEntry.gradientTopColor = i2;
                int i3 = iArr[1];
                previewView.gradientBottom = i3;
                storyEntry.gradientBottomColor = i3;
                previewView.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                previewView.invalidate();
                VideoEditTextureView videoEditTextureView = previewView.textureView;
                if (videoEditTextureView != null) {
                    videoEditTextureView.updateUiBlurGradient(previewView.gradientTop, previewView.gradientBottom);
                }
                PhotoFilterView photoFilterView = previewView.photoFilterView;
                if (photoFilterView != null) {
                    photoFilterView.updateUiBlurGradient(previewView.gradientTop, previewView.gradientBottom);
                }
                break;
            case 1:
                QuickRepliesActivity quickRepliesActivity = QuickRepliesActivity.this;
                quickRepliesActivity.clearSelection();
                QuickRepliesController.getInstance(((BaseFragment) quickRepliesActivity).currentAccount).renameReply(i, (String) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                UnconfirmedAuthHintCell unconfirmedAuthHintCell = (UnconfirmedAuthHintCell) obj2;
                unconfirmedAuthHintCell.getClass();
                if (LaunchActivity.isActive) {
                    if (arrayList == null || arrayList.size() == 0) {
                        UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(Bulletin.BulletinWindow.make(unconfirmedAuthHintCell.getContext()), null), R.string.UnknownError);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(unconfirmedAuthHintCell.getContext());
                        linearLayout.setOrientation(1);
                        RLottieImageView rLottieImageView = new RLottieImageView(unconfirmedAuthHintCell.getContext());
                        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        rLottieImageView.setAnimation(R.raw.ic_ban, 50, 50);
                        rLottieImageView.playAnimation();
                        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
                        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false)));
                        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(unconfirmedAuthHintCell.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 28.0f, 14.0f, 28.0f, 0.0f));
                        TextView textView2 = new TextView(unconfirmedAuthHintCell.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        String string2 = "";
                        if (arrayList.size() == 1) {
                            int i4 = R.string.UnconfirmedAuthDeniedMessageSingle;
                            UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0);
                            if (unconfirmedAuth != null) {
                                String strConcat = "" + unconfirmedAuth.device;
                                if (!TextUtils.isEmpty(unconfirmedAuth.location) && !strConcat.isEmpty()) {
                                    strConcat = strConcat.concat(", ");
                                }
                                StringBuilder sbM = DiffUtil.m(strConcat);
                                sbM.append(unconfirmedAuth.location);
                                string2 = sbM.toString();
                            }
                            textView2.setText(LocaleController.formatString(i4, string2));
                        } else {
                            String strM = "\n";
                            for (int i5 = 0; i5 < Math.min(arrayList.size(), 10); i5++) {
                                StringBuilder sbM2 = Log.m(strM, "• ");
                                UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth2 = (UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i5);
                                if (unconfirmedAuth2 == null) {
                                    string = "";
                                } else {
                                    String strConcat2 = "" + unconfirmedAuth2.device;
                                    if (!TextUtils.isEmpty(unconfirmedAuth2.location) && !strConcat2.isEmpty()) {
                                        strConcat2 = strConcat2.concat(", ");
                                    }
                                    StringBuilder sbM3 = DiffUtil.m(strConcat2);
                                    sbM3.append(unconfirmedAuth2.location);
                                    string = sbM3.toString();
                                }
                                strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sbM2, string, "\n");
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, strM));
                        }
                        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 40.0f, 9.0f, 40.0f, 0.0f));
                        FrameLayout frameLayout = new FrameLayout(unconfirmedAuthHintCell.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int iDp = AndroidUtilities.dp(12.0f);
                        int i6 = Theme.key_text_RedBold;
                        frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(Theme.currentTheme.isDark() ? 0.2f : 0.15f, Theme.getColor(null, i6, false))));
                        TextView textView3 = new TextView(unconfirmedAuthHintCell.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(Theme.getColor(null, i6, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -1, 119));
                        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 14.0f, 19.0f, 14.0f, 0.0f));
                        ButtonWithCounterView round = new ButtonWithCounterView(unconfirmedAuthHintCell.getContext(), true, null).setRound();
                        ScaleStateListAnimator.apply(round, 0.02f, 1.5f);
                        round.setText(LocaleController.getString(R.string.GotIt), false);
                        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 14.0f, 20.0f, 14.0f, 4.0f));
                        BottomSheet bottomSheet = new BottomSheet(unconfirmedAuthHintCell.getContext(), false, false, null);
                        bottomSheet.fixNavigationBar();
                        bottomSheet.customView = linearLayout;
                        bottomSheet.show();
                        bottomSheet.setCanDismissWithSwipe(false);
                        bottomSheet.setCanDismissWithTouchOutside(false);
                        round.setTimer(5, new UnconfirmedAuthHintCell$$ExternalSyntheticLambda5(bottomSheet, 0));
                        round.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(11, round, bottomSheet));
                    }
                }
                unconfirmedAuthHintCell.noButton.setLoading(false, true);
                MessagesController.getInstance(i).getUnconfirmedAuthController().cleanup();
                break;
        }
    }
}
