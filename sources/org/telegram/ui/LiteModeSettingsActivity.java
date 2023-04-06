package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.IntSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarAccessibilityDelegate;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LiteModeSettingsActivity;
public class LiteModeSettingsActivity extends BaseFragment {
    private int FLAGS_CHAT;
    Adapter adapter;
    FrameLayout contentView;
    RecyclerListView listView;
    Bulletin restrictBulletin;
    private Utilities.Callback<Boolean> onPowerAppliedChange = new Utilities.Callback() {
        @Override
        public final void run(Object obj) {
            LiteModeSettingsActivity.this.lambda$new$1((Boolean) obj);
        }
    };
    private boolean[] expanded = new boolean[3];
    private ArrayList<Item> oldItems = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("PowerUsage", R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    LiteModeSettingsActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView2 = this.listView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView2.setAdapter(adapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
            }

            @Override
            public void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i, float f, float f2) {
                LiteModeSettingsActivity.this.lambda$createView$0(view, i, f, f2);
            }
        });
        this.fragmentView = this.contentView;
        this.FLAGS_CHAT = AndroidUtilities.isTablet() ? 33184 : LiteMode.FLAGS_CHAT;
        updateItems();
        return this.fragmentView;
    }

    public void lambda$createView$0(View view, int i, float f, float f2) {
        int expandedIndex;
        if (view == null || i < 0 || i >= this.items.size()) {
            return;
        }
        Item item = this.items.get(i);
        int i2 = item.viewType;
        if (i2 == 3 || i2 == 4) {
            if (LiteMode.isPowerSaverApplied()) {
                this.restrictBulletin = BulletinFactory.of(this).createSimpleBulletin(new BatteryDrawable(0.1f, -1, Theme.getColor("dialogSwipeRemove"), 1.3f), LocaleController.getString("LiteBatteryRestricted", R.string.LiteBatteryRestricted)).show();
            } else if (item.viewType == 3 && item.getFlagsCount() > 1 && (!LocaleController.isRTL ? f < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f > AndroidUtilities.dp(75.0f)) && (expandedIndex = getExpandedIndex(item.flags)) != -1) {
                boolean[] zArr = this.expanded;
                zArr[expandedIndex] = !zArr[expandedIndex];
                updateValues();
                updateItems();
            } else {
                LiteMode.toggleFlag(item.flags, !LiteMode.isEnabledSetting(item.flags));
                updateValues();
            }
        } else if (i2 == 5 && item.type == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            edit.putBoolean("view_animations", !z);
            SharedConfig.setAnimationsEnabled(!z);
            edit.commit();
            ((TextCell) view).setChecked(!z);
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.onPowerAppliedChange);
    }

    @Override
    public void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.onPowerAppliedChange);
    }

    public void lambda$new$1(Boolean bool) {
        updateValues();
    }

    public int getExpandedIndex(int i) {
        if (i == 3) {
            return 0;
        }
        if (i == 28700) {
            return 1;
        }
        return i == this.FLAGS_CHAT ? 2 : -1;
    }

    private void updateItems() {
        String formatString;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        if (Build.VERSION.SDK_INT >= 21) {
            this.items.add(Item.asSlider());
            ArrayList<Item> arrayList = this.items;
            if (LiteMode.getPowerSaverLevel() <= 0) {
                formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
            } else if (LiteMode.getPowerSaverLevel() >= 100) {
                formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
            } else {
                formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
            }
            arrayList.add(Item.asInfo(formatString));
        }
        this.items.add(Item.asHeader(LocaleController.getString("LiteOptionsTitle")));
        this.items.add(Item.asSwitch(R.drawable.msg2_sticker, LocaleController.getString("LiteOptionsStickers", R.string.LiteOptionsStickers), 3));
        if (this.expanded[0]) {
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsAutoplayKeyboard"), 1));
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsAutoplayChat"), 2));
        }
        this.items.add(Item.asSwitch(R.drawable.msg2_smile_status, LocaleController.getString("LiteOptionsEmoji", R.string.LiteOptionsEmoji), LiteMode.FLAGS_ANIMATED_EMOJI));
        if (this.expanded[1]) {
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsAutoplayKeyboard"), LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD));
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsAutoplayReactions"), LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS));
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsAutoplayChat"), LiteMode.FLAG_ANIMATED_EMOJI_CHAT));
        }
        this.items.add(Item.asSwitch(R.drawable.msg2_ask_question, LocaleController.getString("LiteOptionsChat"), this.FLAGS_CHAT));
        if (this.expanded[2]) {
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsBackground"), 32));
            if (!AndroidUtilities.isTablet()) {
                this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsTopics"), 64));
            }
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsSpoiler"), 128));
            if (SharedConfig.getDevicePerformanceClass() >= 1) {
                this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsBlur"), LiteMode.FLAG_CHAT_BLUR));
            }
            this.items.add(Item.asCheckbox(LocaleController.getString("LiteOptionsScale"), LiteMode.FLAG_CHAT_SCALE));
        }
        this.items.add(Item.asSwitch(R.drawable.msg2_call_earpiece, LocaleController.getString("LiteOptionsCalls"), LiteMode.FLAG_CALLS_ANIMATIONS));
        this.items.add(Item.asSwitch(R.drawable.msg2_videocall, LocaleController.getString("LiteOptionsAutoplayVideo"), 1024));
        this.items.add(Item.asSwitch(R.drawable.msg2_gif, LocaleController.getString("LiteOptionsAutoplayGifs"), LiteMode.FLAG_AUTOPLAY_GIFS));
        this.items.add(Item.asInfo(""));
        this.items.add(Item.asSwitch(LocaleController.getString("LiteSmoothTransitions"), 0));
        this.items.add(Item.asInfo(LocaleController.getString("LiteSmoothTransitionsInfo")));
        this.adapter.setItems(this.oldItems, this.items);
    }

    public void updateInfo() {
        String formatString;
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (this.items.isEmpty()) {
            updateItems();
        } else if (this.items.size() >= 2) {
            ArrayList<Item> arrayList = this.items;
            if (LiteMode.getPowerSaverLevel() <= 0) {
                formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
            } else if (LiteMode.getPowerSaverLevel() >= 100) {
                formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
            } else {
                formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
            }
            arrayList.set(1, Item.asInfo(formatString));
            this.adapter.notifyItemChanged(1);
        }
    }

    public void updateValues() {
        int childAdapterPosition;
        if (this.listView == null) {
            return;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt != null && (childAdapterPosition = this.listView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < this.items.size()) {
                Item item = this.items.get(childAdapterPosition);
                int i2 = item.viewType;
                if (i2 == 3 || i2 == 4) {
                    ((SwitchCell) childAt).update(item);
                } else if (i2 == 1) {
                    ((PowerSaverSlider) childAt).update();
                }
            }
        }
        if (this.restrictBulletin == null || LiteMode.isPowerSaverApplied()) {
            return;
        }
        this.restrictBulletin.hide();
        this.restrictBulletin = null;
    }

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View switchCell;
            Context context = viewGroup.getContext();
            if (i == 0) {
                switchCell = new HeaderCell(context);
                switchCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 1) {
                switchCell = new PowerSaverSlider(context);
                switchCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 2) {
                switchCell = new TextInfoPrivacyCell(this, context) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setEnabled(true);
                    }

                    @Override
                    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                        super.onPopulateAccessibilityEvent(accessibilityEvent);
                        accessibilityEvent.setContentDescription(getTextView().getText());
                        setContentDescription(getTextView().getText());
                    }
                };
            } else if (i == 3 || i == 4) {
                switchCell = new SwitchCell(context);
            } else if (i == 5) {
                switchCell = new TextCell(context, 23, false, true, null);
                switchCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else {
                switchCell = null;
            }
            return new RecyclerListView.Holder(switchCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= LiteModeSettingsActivity.this.items.size()) {
                return;
            }
            Item item = (Item) LiteModeSettingsActivity.this.items.get(i);
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((HeaderCell) viewHolder.itemView).setText(item.text);
                return;
            }
            boolean z = true;
            if (itemViewType == 1) {
                ((PowerSaverSlider) viewHolder.itemView).update();
            } else if (itemViewType != 2) {
                if (itemViewType == 3 || itemViewType == 4) {
                    int i2 = i + 1;
                    ((SwitchCell) viewHolder.itemView).set(item, (i2 >= LiteModeSettingsActivity.this.items.size() || ((Item) LiteModeSettingsActivity.this.items.get(i2)).viewType == 2) ? false : false);
                } else if (itemViewType == 5) {
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (item.type == 0) {
                        textCell.setTextAndCheck(item.text, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                    }
                }
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (TextUtils.isEmpty(item.text)) {
                    textInfoPrivacyCell.setFixedSize(12);
                } else {
                    textInfoPrivacyCell.setFixedSize(0);
                }
                textInfoPrivacyCell.setText(item.text);
                textInfoPrivacyCell.setContentDescription(item.text);
                boolean z2 = i > 0 && ((Item) LiteModeSettingsActivity.this.items.get(i + (-1))).viewType != 2;
                int i3 = i + 1;
                z = (i3 >= LiteModeSettingsActivity.this.items.size() || ((Item) LiteModeSettingsActivity.this.items.get(i3)).viewType == 2) ? false : false;
                if (z2 && z) {
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(LiteModeSettingsActivity.this.getContext(), R.drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (z2) {
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(LiteModeSettingsActivity.this.getContext(), R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                } else if (z) {
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(LiteModeSettingsActivity.this.getContext(), R.drawable.greydivider_top, "windowBackgroundGrayShadow"));
                } else {
                    textInfoPrivacyCell.setBackground(null);
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i < 0 || i >= LiteModeSettingsActivity.this.items.size()) {
                return 2;
            }
            return ((Item) LiteModeSettingsActivity.this.items.get(i)).viewType;
        }

        @Override
        public int getItemCount() {
            return LiteModeSettingsActivity.this.items.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 4 || viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 5;
        }
    }

    public class SwitchCell extends FrameLayout {
        private int all;
        private ImageView arrowView;
        private CheckBox2 checkBoxView;
        private boolean containing;
        private AnimatedTextView countTextView;
        private boolean disabled;
        private int enabled;
        private ImageView imageView;
        private boolean needDivider;
        private boolean needLine;
        private Switch switchView;
        private TextView textView;
        private LinearLayout textViewLayout;

        public SwitchCell(Context context) {
            super(context);
            setImportantForAccessibility(1);
            setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
            this.imageView.setVisibility(8);
            addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
            TextView textView = new TextView(this, context, LiteModeSettingsActivity.this) {
                @Override
                protected void onMeasure(int i, int i2) {
                    if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                        i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - AndroidUtilities.dp(52.0f), Integer.MIN_VALUE);
                    }
                    super.onMeasure(i, i2);
                }
            };
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextSize(1, 16.0f);
            this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.textView.setImportantForAccessibility(2);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.countTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.35f, 0L, 200L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.countTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.countTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.countTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.countTextView.setImportantForAccessibility(2);
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setVisibility(8);
            this.arrowView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
            this.arrowView.setImageResource(R.drawable.arrow_more);
            LinearLayout linearLayout = new LinearLayout(context);
            this.textViewLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.textViewLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            if (LocaleController.isRTL) {
                this.textViewLayout.addView(this.arrowView, LayoutHelper.createLinear(16, 16, 0.0f, 16, 0, 0, 6, 0));
                this.textViewLayout.addView(this.countTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 0, 6, 0));
                this.textViewLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2, 16));
            } else {
                this.textViewLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2, 16));
                this.textViewLayout.addView(this.countTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 6, 0, 0, 0));
                this.textViewLayout.addView(this.arrowView, LayoutHelper.createLinear(16, 16, 0.0f, 16, 2, 0, 0, 0));
            }
            addView(this.textViewLayout, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
            Switch r5 = new Switch(context);
            this.switchView = r5;
            r5.setVisibility(8);
            this.switchView.setColors("switchTrack", "switchTrackChecked", "windowBackgroundWhite", "windowBackgroundWhite");
            this.switchView.setImportantForAccessibility(2);
            addView(this.switchView, LayoutHelper.createFrame(37, 50.0f, (LocaleController.isRTL ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBoxView = checkBox2;
            checkBox2.setColor("radioBackgroundChecked", "checkboxDisabled", "checkboxCheck");
            this.checkBoxView.setDrawUnchecked(true);
            this.checkBoxView.setChecked(true, false);
            this.checkBoxView.setDrawBackgroundAsArc(10);
            this.checkBoxView.setVisibility(8);
            this.checkBoxView.setImportantForAccessibility(2);
            CheckBox2 checkBox22 = this.checkBoxView;
            boolean z = LocaleController.isRTL;
            addView(checkBox22, LayoutHelper.createFrame(21, 21.0f, (z ? 5 : 3) | 16, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            setFocusable(true);
        }

        public void setDisabled(boolean z, boolean z2) {
            if (this.disabled != z) {
                this.disabled = z;
                if (z2) {
                    this.imageView.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                    this.textViewLayout.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                    this.switchView.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                    this.checkBoxView.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                } else {
                    this.imageView.setAlpha(z ? 0.5f : 1.0f);
                    this.textViewLayout.setAlpha(z ? 0.5f : 1.0f);
                    this.switchView.setAlpha(z ? 0.5f : 1.0f);
                    this.checkBoxView.setAlpha(z ? 0.5f : 1.0f);
                }
                setEnabled(!z);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public void set(Item item, boolean z) {
            float f;
            boolean z2 = true;
            if (item.viewType == 3) {
                this.checkBoxView.setVisibility(8);
                this.imageView.setVisibility(0);
                this.imageView.setImageResource(item.iconResId);
                this.textView.setText(item.text);
                boolean z3 = item.getFlagsCount() > 1;
                this.containing = z3;
                if (z3) {
                    updateCount(item, false);
                    this.countTextView.setVisibility(0);
                    this.arrowView.setVisibility(0);
                } else {
                    this.countTextView.setVisibility(8);
                    this.arrowView.setVisibility(8);
                }
                this.textView.setTranslationX(0.0f);
                this.switchView.setVisibility(0);
                this.switchView.setChecked(LiteMode.isEnabled(item.flags), false);
                this.needLine = item.getFlagsCount() > 1;
            } else {
                this.checkBoxView.setVisibility(0);
                this.checkBoxView.setChecked(LiteMode.isEnabled(item.flags), false);
                this.imageView.setVisibility(8);
                this.switchView.setVisibility(8);
                this.countTextView.setVisibility(8);
                this.arrowView.setVisibility(8);
                this.textView.setText(item.text);
                this.textView.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                this.containing = false;
                this.needLine = false;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.textViewLayout.getLayoutParams();
            if (item.viewType == 3) {
                f = (LocaleController.isRTL ? 64 : 75) + 4;
            } else {
                f = 8.0f;
            }
            marginLayoutParams.rightMargin = AndroidUtilities.dp(f);
            this.needDivider = z;
            setWillNotDraw((z || this.needLine) ? false : false);
            setDisabled(LiteMode.isPowerSaverApplied(), false);
        }

        public void update(Item item) {
            if (item.viewType == 3) {
                boolean z = item.getFlagsCount() > 1;
                this.containing = z;
                if (z) {
                    updateCount(item, true);
                    int expandedIndex = LiteModeSettingsActivity.this.getExpandedIndex(item.flags);
                    this.arrowView.clearAnimation();
                    this.arrowView.animate().rotation((expandedIndex < 0 || !LiteModeSettingsActivity.this.expanded[expandedIndex]) ? 0.0f : 180.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(240L).start();
                }
                this.switchView.setChecked(LiteMode.isEnabled(item.flags), true);
            } else {
                this.checkBoxView.setChecked(LiteMode.isEnabled(item.flags), true);
            }
            setDisabled(LiteMode.isPowerSaverApplied(), true);
        }

        private void updateCount(Item item, boolean z) {
            boolean z2 = true;
            this.enabled = preprocessFlagsCount(LiteMode.getValue(true) & item.flags);
            this.all = preprocessFlagsCount(item.flags);
            this.countTextView.setText(String.format("%d/%d", Integer.valueOf(this.enabled), Integer.valueOf(this.all)), (!z || LocaleController.isRTL) ? false : false);
        }

        private int preprocessFlagsCount(int r4) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LiteModeSettingsActivity.SwitchCell.preprocessFlagsCount(int):int");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (LocaleController.isRTL) {
                if (this.needLine) {
                    float dp = AndroidUtilities.dp(75.0f);
                    canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (getMeasuredHeight() + AndroidUtilities.dp(20.0f)) / 2.0f, Theme.dividerPaint);
                }
                if (this.needDivider) {
                    canvas.drawLine((getMeasuredWidth() - AndroidUtilities.dp(64.0f)) + (this.textView.getTranslationX() < 0.0f ? AndroidUtilities.dp(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, Theme.dividerPaint);
                    return;
                }
                return;
            }
            if (this.needLine) {
                float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
                canvas.drawRect(measuredWidth - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth, (getMeasuredHeight() + AndroidUtilities.dp(20.0f)) / 2.0f, Theme.dividerPaint);
            }
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(64.0f) + this.textView.getTranslationX(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(this.checkBoxView.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
            if (this.checkBoxView.getVisibility() == 0) {
                accessibilityNodeInfo.setChecked(this.checkBoxView.isChecked());
            } else {
                accessibilityNodeInfo.setChecked(this.switchView.isChecked());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.textView.getText());
            if (this.containing) {
                sb.append('\n');
                sb.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.enabled), Integer.valueOf(this.all)));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    public class PowerSaverSlider extends FrameLayout {
        BatteryDrawable batteryIcon;
        SpannableStringBuilder batteryText;
        LinearLayout headerLayout;
        AnimatedTextView headerOnView;
        private boolean headerOnVisible;
        TextView headerTextView;
        TextView leftTextView;
        AnimatedTextView middleTextView;
        private ValueAnimator offActiveAnimator;
        private float offActiveT;
        private ValueAnimator onActiveAnimator;
        private float onActiveT;
        TextView rightTextView;
        private SeekBarAccessibilityDelegate seekBarAccessibilityDelegate;
        SeekBarView seekBarView;
        FrameLayout valuesView;

        public PowerSaverSlider(Context context) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            this.headerLayout = linearLayout;
            linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            this.headerLayout.setImportantForAccessibility(4);
            TextView textView = new TextView(context);
            this.headerTextView = textView;
            textView.setTextSize(1, 15.0f);
            this.headerTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.headerTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
            this.headerTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.headerTextView.setText(LocaleController.getString("LiteBatteryTitle"));
            this.headerLayout.addView(this.headerTextView, LayoutHelper.createLinear(-2, -2, 16));
            AnimatedTextView animatedTextView = new AnimatedTextView(this, context, true, false, false, LiteModeSettingsActivity.this) {
                Drawable backgroundDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(4.0f), Theme.multAlpha(Theme.getColor("windowBackgroundWhiteBlueHeader"), 0.15f));

                @Override
                public void onDraw(Canvas canvas) {
                    this.backgroundDrawable.setBounds(0, 0, (int) (getPaddingLeft() + getDrawable().getCurrentWidth() + getPaddingRight()), getMeasuredHeight());
                    this.backgroundDrawable.draw(canvas);
                    super.onDraw(canvas);
                }
            };
            this.headerOnView = animatedTextView;
            animatedTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.headerOnView.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
            this.headerOnView.setTextSize(AndroidUtilities.dp(12.0f));
            this.headerOnView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
            this.headerLayout.addView(this.headerOnView, LayoutHelper.createLinear(-2, 17, 16, 6, 1, 0, 0));
            addView(this.headerLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
            SeekBarView seekBarView = new SeekBarView(context, true, null);
            this.seekBarView = seekBarView;
            seekBarView.setReportChanges(true);
            this.seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate(LiteModeSettingsActivity.this) {
                @Override
                public CharSequence getContentDescription() {
                    return " ";
                }

                @Override
                public int getStepsCount() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                }

                @Override
                public void onSeekBarPressed(boolean z) {
                }

                @Override
                public void onSeekBarDrag(boolean z, float f) {
                    int round = Math.round(f * 100.0f);
                    if (round != LiteMode.getPowerSaverLevel()) {
                        LiteMode.setPowerSaverLevel(round);
                        LiteModeSettingsActivity.this.updateValues();
                        LiteModeSettingsActivity.this.updateInfo();
                        if (round <= 0 || round >= 100) {
                            try {
                                PowerSaverSlider.this.performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
            this.seekBarView.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
            this.seekBarView.setImportantForAccessibility(2);
            addView(this.seekBarView, LayoutHelper.createFrame(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.valuesView = frameLayout;
            frameLayout.setImportantForAccessibility(4);
            TextView textView2 = new TextView(context);
            this.leftTextView = textView2;
            textView2.setTextSize(1, 13.0f);
            this.leftTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            this.leftTextView.setGravity(3);
            this.leftTextView.setText(LocaleController.getString("LiteBatteryDisabled", R.string.LiteBatteryDisabled));
            this.valuesView.addView(this.leftTextView, LayoutHelper.createFrame(-2, -2, 19));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, true, true, LiteModeSettingsActivity.this) {
                @Override
                public void onMeasure(int i, int i2) {
                    int size = View.MeasureSpec.getSize(i);
                    if (size <= 0) {
                        size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                    }
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - PowerSaverSlider.this.leftTextView.getPaint().measureText(PowerSaverSlider.this.leftTextView.getText().toString())) - PowerSaverSlider.this.rightTextView.getPaint().measureText(PowerSaverSlider.this.rightTextView.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                }
            };
            this.middleTextView = animatedTextView2;
            animatedTextView2.setAnimationProperties(0.45f, 0L, 240L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.middleTextView.setGravity(1);
            this.middleTextView.setTextSize(AndroidUtilities.dp(13.0f));
            this.middleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText"));
            this.valuesView.addView(this.middleTextView, LayoutHelper.createFrame(-2, -2, 17));
            this.batteryText = new SpannableStringBuilder("b");
            BatteryDrawable batteryDrawable = new BatteryDrawable();
            this.batteryIcon = batteryDrawable;
            batteryDrawable.colorFromPaint(this.middleTextView.getPaint());
            this.batteryIcon.setTranslationY(AndroidUtilities.dp(1.5f));
            this.batteryIcon.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
            this.batteryText.setSpan(new ImageSpan(this.batteryIcon, 0), 0, this.batteryText.length(), 33);
            TextView textView3 = new TextView(context);
            this.rightTextView = textView3;
            textView3.setTextSize(1, 13.0f);
            this.rightTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            this.rightTextView.setGravity(5);
            this.rightTextView.setText(LocaleController.getString("LiteBatteryEnabled", R.string.LiteBatteryEnabled));
            this.valuesView.addView(this.rightTextView, LayoutHelper.createFrame(-2, -2, 21));
            addView(this.valuesView, LayoutHelper.createFrame(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
            this.seekBarAccessibilityDelegate = new IntSeekBarAccessibilityDelegate(LiteModeSettingsActivity.this) {
                @Override
                protected int getDelta() {
                    return 5;
                }

                @Override
                protected int getMaxValue() {
                    return 100;
                }

                @Override
                protected int getProgress() {
                    return LiteMode.getPowerSaverLevel();
                }

                @Override
                protected void setProgress(int i) {
                    float f = i / 100.0f;
                    PowerSaverSlider.this.seekBarView.delegate.onSeekBarDrag(true, f);
                    PowerSaverSlider.this.seekBarView.setProgress(f);
                }

                @Override
                public void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.setEnabled(true);
                }

                @Override
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                    StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.LiteBatteryTitle));
                    sb.append(", ");
                    int powerSaverLevel = LiteMode.getPowerSaverLevel();
                    if (powerSaverLevel <= 0) {
                        sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled));
                    } else if (powerSaverLevel >= 100) {
                        sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled));
                    } else {
                        sb.append(LocaleController.formatString(R.string.AccDescrLiteBatteryWhenBelow, Integer.valueOf(Math.round(powerSaverLevel))));
                    }
                    accessibilityEvent.setContentDescription(sb);
                    PowerSaverSlider.this.setContentDescription(sb);
                }
            };
            update();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.seekBarAccessibilityDelegate.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
        }

        @Override
        public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(accessibilityEvent);
            this.seekBarAccessibilityDelegate.onPopulateAccessibilityEvent(this, accessibilityEvent);
        }

        @Override
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            return this.seekBarAccessibilityDelegate.performAccessibilityAction(this, i, bundle);
        }

        public void update() {
            int i;
            String str;
            int powerSaverLevel = LiteMode.getPowerSaverLevel();
            this.middleTextView.cancelAnimation();
            if (powerSaverLevel <= 0) {
                this.middleTextView.setText(LocaleController.getString("LiteBatteryAlwaysDisabled", R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL);
            } else if (powerSaverLevel >= 100) {
                this.middleTextView.setText(LocaleController.getString("LiteBatteryAlwaysEnabled", R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL);
            } else {
                float f = powerSaverLevel;
                this.batteryIcon.setFillValue(f / 100.0f, true);
                this.middleTextView.setText(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString("LiteBatteryWhenBelow", R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f))), this.batteryText)), !LocaleController.isRTL);
            }
            AnimatedTextView animatedTextView = this.headerOnView;
            if (LiteMode.isPowerSaverApplied()) {
                i = R.string.LiteBatteryEnabled;
                str = "LiteBatteryEnabled";
            } else {
                i = R.string.LiteBatteryDisabled;
                str = "LiteBatteryDisabled";
            }
            animatedTextView.setText(LocaleController.getString(str, i).toUpperCase());
            updateHeaderOnVisibility(powerSaverLevel > 0 && powerSaverLevel < 100);
            updateOnActive(powerSaverLevel >= 100);
            updateOffActive(powerSaverLevel <= 0);
        }

        private void updateHeaderOnVisibility(boolean z) {
            if (z != this.headerOnVisible) {
                this.headerOnVisible = z;
                this.headerOnView.clearAnimation();
                this.headerOnView.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(220L).start();
            }
        }

        private void updateOnActive(boolean z) {
            final float f = z ? 1.0f : 0.0f;
            if (this.onActiveT != f) {
                this.onActiveT = f;
                ValueAnimator valueAnimator = this.onActiveAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.onActiveAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.onActiveT, f);
                this.onActiveAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        LiteModeSettingsActivity.PowerSaverSlider.this.lambda$updateOnActive$0(valueAnimator2);
                    }
                });
                this.onActiveAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PowerSaverSlider.this.rightTextView.setTextColor(ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhiteGrayText"), Theme.getColor("windowBackgroundWhiteBlueText"), PowerSaverSlider.this.onActiveT = f));
                    }
                });
                this.onActiveAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.onActiveAnimator.setDuration(320L);
                this.onActiveAnimator.start();
            }
        }

        public void lambda$updateOnActive$0(ValueAnimator valueAnimator) {
            TextView textView = this.rightTextView;
            int color = Theme.getColor("windowBackgroundWhiteGrayText");
            int color2 = Theme.getColor("windowBackgroundWhiteBlueText");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.onActiveT = floatValue;
            textView.setTextColor(ColorUtils.blendARGB(color, color2, floatValue));
        }

        private void updateOffActive(boolean z) {
            final float f = z ? 1.0f : 0.0f;
            if (this.offActiveT != f) {
                this.offActiveT = f;
                ValueAnimator valueAnimator = this.offActiveAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.offActiveAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.offActiveT, f);
                this.offActiveAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        LiteModeSettingsActivity.PowerSaverSlider.this.lambda$updateOffActive$1(valueAnimator2);
                    }
                });
                this.offActiveAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PowerSaverSlider.this.leftTextView.setTextColor(ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhiteGrayText"), Theme.getColor("windowBackgroundWhiteBlueText"), PowerSaverSlider.this.offActiveT = f));
                    }
                });
                this.offActiveAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.offActiveAnimator.setDuration(320L);
                this.offActiveAnimator.start();
            }
        }

        public void lambda$updateOffActive$1(ValueAnimator valueAnimator) {
            TextView textView = this.leftTextView;
            int color = Theme.getColor("windowBackgroundWhiteGrayText");
            int color2 = Theme.getColor("windowBackgroundWhiteBlueText");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.offActiveT = floatValue;
            textView.setTextColor(ColorUtils.blendARGB(color, color2, floatValue));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
        }
    }

    public static class Item extends AdapterWithDiffUtils.Item {
        public int flags;
        public int iconResId;
        public CharSequence text;
        public int type;

        private Item(int i, CharSequence charSequence, int i2, int i3, int i4) {
            super(i, false);
            this.text = charSequence;
            this.iconResId = i2;
            this.flags = i3;
            this.type = i4;
        }

        public static Item asHeader(CharSequence charSequence) {
            return new Item(0, charSequence, 0, 0, 0);
        }

        public static Item asSlider() {
            return new Item(1, null, 0, 0, 0);
        }

        public static Item asInfo(CharSequence charSequence) {
            return new Item(2, charSequence, 0, 0, 0);
        }

        public static Item asSwitch(int i, CharSequence charSequence, int i2) {
            return new Item(3, charSequence, i, i2, 0);
        }

        public static Item asCheckbox(CharSequence charSequence, int i) {
            return new Item(4, charSequence, 0, i, 0);
        }

        public static Item asSwitch(CharSequence charSequence, int i) {
            return new Item(5, charSequence, 0, 0, i);
        }

        public int getFlagsCount() {
            return Integer.bitCount(this.flags);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Item) {
                Item item = (Item) obj;
                int i = item.viewType;
                int i2 = this.viewType;
                if (i != i2) {
                    return false;
                }
                if (i2 != 3 || item.iconResId == this.iconResId) {
                    if (i2 != 5 || item.type == this.type) {
                        if ((i2 == 3 || i2 == 4) && item.flags != this.flags) {
                            return false;
                        }
                        return !(i2 == 0 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) || TextUtils.equals(item.text, this.text);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        AnimatedEmojiDrawable.updateAll();
        Theme.reloadWallpaper();
    }
}
