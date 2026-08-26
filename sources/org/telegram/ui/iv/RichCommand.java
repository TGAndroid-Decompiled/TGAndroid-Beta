package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class RichCommand {
    public static ArrayList cmds;
    public final List commands;
    public final int icon;
    public final String name;

    public final class View extends LinearLayout implements Theme.Colorable {
        public final ImageView iconView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;
        public final TextView textView2;

        public View(Context context, RichCommand richCommand, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createLinear(42, 42, 19, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            TextView textView2 = new TextView(context);
            this.textView2 = textView2;
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity(5);
            addView(textView, LayoutHelper.createLinear(-2, -2, 19, 8, 0, 0, 0));
            addView(new Space(context), LayoutHelper.createLinear(0, -2, 1.0f, 119));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 21, 8, 0, 0, 0));
            imageView.setImageResource(richCommand.icon);
            textView.setText(richCommand.name);
            textView2.setText((CharSequence) richCommand.commands.get(0));
            updateColors$1();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        @Override
        public final void updateColors$1() {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.iconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.textView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.textView2.setTextColor(Theme.multAlpha(0.75f, Theme.getColor(i, resourcesProvider)));
        }
    }

    public RichCommand(String[] strArr, String str, int i) {
        this.icon = i;
        this.name = str;
        this.commands = Arrays.asList(strArr);
    }

    public static ArrayList match(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.startsWith("/")) {
            strTrim = strTrim.substring(1);
        }
        String lowerCase = strTrim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = cmds;
        if (arrayList2 == null) {
            ArrayList arrayList3 = new ArrayList();
            cmds = arrayList3;
            arrayList3.add(new RichCommand(new String[]{"#", "/h1", "/header", "/title", "/heading"}, LocaleController.getString(R.string.ArticleHeading1), R.drawable.iv_h1));
            cmds.add(new RichCommand(new String[]{"##", "/h2"}, LocaleController.getString(R.string.ArticleHeading2), R.drawable.iv_h2));
            cmds.add(new RichCommand(new String[]{"###", "/h3"}, LocaleController.getString(R.string.ArticleHeading3), R.drawable.iv_h3));
            cmds.add(new RichCommand(new String[]{"####", "/h4"}, LocaleController.getString(R.string.ArticleHeading4), R.drawable.iv_h4));
            cmds.add(new RichCommand(new String[]{"#####", "/h5"}, LocaleController.getString(R.string.ArticleHeading5), R.drawable.iv_h5));
            cmds.add(new RichCommand(new String[]{"######", "/h6"}, LocaleController.getString(R.string.ArticleHeading6), R.drawable.iv_h6));
            cmds.add(new RichCommand(new String[]{"|", "/quote"}, LocaleController.getString(R.string.ArticleQuote), R.drawable.iv_quote));
            cmds.add(new RichCommand(new String[]{"/pullquote"}, LocaleController.getString(R.string.ArticlePullquote), R.drawable.iv_pullquote));
            cmds.add(new RichCommand(new String[]{"```", "/code", "/pre", "/preformatted"}, LocaleController.getString(R.string.ArticleCode), R.drawable.iv_code));
            cmds.add(new RichCommand(new String[]{"/footer"}, LocaleController.getString(R.string.ArticleFooter), R.drawable.iv_footer));
            cmds.add(new RichCommand(new String[]{"-", "/list"}, LocaleController.getString(R.string.ArticleCommandList), R.drawable.iv_list));
            cmds.add(new RichCommand(new String[]{"1."}, LocaleController.getString(R.string.ArticleCommandOrderedList), R.drawable.iv_ordered_list));
            cmds.add(new RichCommand(new String[]{"[]", "/todo", "/checklist"}, LocaleController.getString(R.string.ArticleListChecklist), R.drawable.iv_todo));
            cmds.add(new RichCommand(new String[]{">", "/toggle", "/details"}, LocaleController.getString(R.string.ArticleCommandToggle), R.drawable.iv_details));
            cmds.add(new RichCommand(new String[]{"/button"}, LocaleController.getString(R.string.RichEditorButton), R.drawable.iv_button));
            cmds.add(new RichCommand(new String[]{"/table"}, LocaleController.getString(R.string.ArticleCommandTable), R.drawable.iv_table));
            cmds.add(new RichCommand(new String[]{"/math", "/latex", "/expression"}, LocaleController.getString(R.string.ArticleCommandMath), R.drawable.iv_math));
            cmds.add(new RichCommand(new String[]{"---"}, LocaleController.getString(R.string.ArticleCommandDivider), R.drawable.iv_divider));
            ArrayList arrayList4 = cmds;
            int i = R.drawable.iv_media;
            arrayList4.add(new RichCommand(new String[]{"/image", "/pic", "/picture", "/photo", "/img", "/media"}, LocaleController.getString(R.string.ArticleCommandImage), i));
            cmds.add(new RichCommand(new String[]{"/video", "/vid", "/media"}, LocaleController.getString(R.string.ArticleCommandVideo), i));
            cmds.add(new RichCommand(new String[]{"/audio", "/music", "/media"}, LocaleController.getString(R.string.ArticleCommandAudio), R.drawable.iv_audio));
            cmds.add(new RichCommand(new String[]{"/map", "/location", "/venue"}, LocaleController.getString(R.string.ArticleCommandMap), R.drawable.iv_location));
            arrayList2 = cmds;
        }
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            RichCommand richCommand = (RichCommand) obj;
            if (!lowerCase.isEmpty()) {
                String[] strArrSplit = richCommand.name.toLowerCase().split(" ");
                int length = strArrSplit.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        Iterator it = richCommand.commands.iterator();
                        while (it.hasNext()) {
                            String lowerCase2 = ((String) it.next()).toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                        break;
                    }
                    if (!strArrSplit[i3].startsWith(lowerCase)) {
                        i3++;
                    }
                }
            }
            arrayList.add(richCommand);
        }
        return arrayList;
    }
}
